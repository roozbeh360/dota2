package com.github.clentfort.dota2.parser;

/*
Copyright (c) 2002 Parser.org

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

The Software shall be used for Good, not Evil.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/**
 * A ParserObject is an unordered collection of name/value pairs. Its external
 * form is a string wrapped in curly braces with colons between the names and
 * values, and commas between the values and names. The internal form is an
 * object having <code>get</code> and <code>opt</code> methods for accessing the
 * values by name, and <code>put</code> methods for adding or replacing values
 * by name. The values can be any of these types: <code>Boolean</code>,
 * <code>ParserArray</code>, <code>ParserObject</code>, <code>Number</code>,
 * <code>String</code>, or the <code>ParserObject.NULL</code> object. A ParserObject
 * constructor can be used to convert an external form Parser text into an
 * internal form whose values can be retrieved with the <code>get</code> and
 * <code>opt</code> methods, or to convert values into a Parser text using the
 * <code>put</code> and <code>toString</code> methods. A <code>get</code> method
 * returns a value if one can be found, and throws an exception if one cannot be
 * found. An <code>opt</code> method returns a default value instead of throwing
 * an exception, and so is useful for obtaining optional values.
 * <p>
 * The generic <code>get()</code> and <code>opt()</code> methods return an
 * object, which you can cast or query for type. There are also typed
 * <code>get</code> and <code>opt</code> methods that do type checking and type
 * coercion for you. The opt methods differ from the get methods in that they do
 * not throw. Instead, they return a specified value, such as null.
 * <p>
 * The <code>put</code> methods add or replace values in an object. For example,
 *
 * <pre>
 * myString = new ParserObject().put(&quot;Parser&quot;, &quot;Hello, World!&quot;).toString();
 * </pre>
 *
 * produces the string <code>{"Parser": "Hello, World"}</code>.
 * <p>
 * The texts produced by the <code>toString</code> methods strictly conform to
 * the Parser syntax rules. The constructors are more forgiving in the texts they
 * will accept:
 * <ul>
 * <li>An extra <code>,</code>&nbsp;<small>(comma)</small> may appear just
 * before the closing brace.</li>
 * <li>Strings may be quoted with <code>'</code>&nbsp;<small>(single
 * quote)</small>.</li>
 * <li>Strings do not need to be quoted at all if they do not begin with a quote
 * or single quote, and if they do not contain leading or trailing spaces, and
 * if they do not contain any of these characters:
 * <code>{ } [ ] / \ : , = ; #</code> and if they do not look like numbers and
 * if they are not the reserved words <code>true</code>, <code>false</code>, or
 * <code>null</code>.</li>
 * <li>Keys can be followed by <code>=</code> or <code>=></code> as well as by
 * <code>:</code>.</li>
 * <li>Values can be followed by <code>;</code> <small>(semicolon)</small> as
 * well as by <code>,</code> <small>(comma)</small>.</li>
 * </ul>
 *
 * @author Parser.org
 * @version 2012-04-20
 */
public class ParserObject {

    /**
     * ParserObject.NULL is equivalent to the value that JavaScript calls null,
     * whilst Java's null is equivalent to the value that JavaScript calls
     * undefined.
     */
     private static final class Null {

        /**
         * There is only intended to be a single instance of the NULL object,
         * so the clone method returns itself.
         * @return     NULL.
         */
        protected final Object clone() {
            return this;
        }

        /**
         * A Null object is equal to the null value and to itself.
         * @param object    An object to test for nullness.
         * @return true if the object parameter is the ParserObject.NULL object
         *  or null.
         */
        public boolean equals(Object object) {
            return object == null || object == this;
        }

        /**
         * Get the "null" string value.
         * @return The string "null".
         */
        public String toString() {
            return "null";
        }
    }


    /**
     * The map where the ParserObject's properties are kept.
     */
    private final Map<String, Object> map;


    /**
     * It is sometimes more convenient and less ambiguous to have a
     * <code>NULL</code> object than to use Java's <code>null</code> value.
     * <code>ParserObject.NULL.equals(null)</code> returns <code>true</code>.
     * <code>ParserObject.NULL.toString()</code> returns <code>"null"</code>.
     */
    public static final Object NULL = new Null();


    /**
     * Construct an empty ParserObject.
     */
    public ParserObject() {
        this.map = new HashMap();
    }


    /**
     * Construct a ParserObject from a subset of another ParserObject.
     * An array of strings is used to identify the keys that should be copied.
     * Missing keys are ignored.
     * @param jo A ParserObject.
     * @param names An array of strings.
     * @throws ParserException
     * @exception ParserException If a value is a non-finite number or if a name is duplicated.
     */
    public ParserObject(ParserObject jo, String[] names) {
        this();
        for (int i = 0; i < names.length; i += 1) {
            try {
                this.putOnce(names[i], jo.opt(names[i]));
            } catch (Exception ignore) {
            }
        }
    }


    /**
     * Construct a ParserObject from a ParserTokener.
     * @param x A ParserTokener object containing the source string.
     * @throws ParserException If there is a syntax error in the source string
     *  or a duplicated key.
     */
    public ParserObject(ParserTokener x) throws ParserException {
        this();
        char c;
        String key;
        x.skipTo('{');
        if (x.nextClean() != '{') {
            throw x.syntaxError("A ParserObject text must begin with '{'");
        }
        for (;;) {
            c = x.nextClean();
            switch (c) {
            case 0:
                throw x.syntaxError("A ParserObject text must end with '}'");
            case '}':
                return;
            default:
                key = x.nextString('"');
            }

            c = x.nextClean();
            x.back();
            this.put(key, x.nextValue());

            switch (x.nextClean()) {
            case '"':
            case '\'':
                x.back();
                break;
            case '}':
                return;
            default:
                throw x.syntaxError("Expected a '\"' or '}'");
            }
        }
    }



    /**
     * Construct a ParserObject from a source Parser text string.
     * This is the most commonly used ParserObject constructor.
     * @param source    A string beginning
     *  with <code>{</code>&nbsp;<small>(left brace)</small> and ending
     *  with <code>}</code>&nbsp;<small>(right brace)</small>.
     * @exception ParserException If there is a syntax error in the source
     *  string or a duplicated key.
     */
    public ParserObject(String source) throws ParserException {
        this(new ParserTokener(source));
    }


    /**
     * Produce a string from a double. The string "null" will be returned if
     * the number is not finite.
     * @param  d A double.
     * @return A String.
     */
    public static String doubleToString(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            return "null";
        }

// Shave off trailing zeros and decimal point, if possible.

        String string = Double.toString(d);
        if (string.indexOf('.') > 0 && string.indexOf('e') < 0 &&
                string.indexOf('E') < 0) {
            while (string.endsWith("0")) {
                string = string.substring(0, string.length() - 1);
            }
            if (string.endsWith(".")) {
                string = string.substring(0, string.length() - 1);
            }
        }
        return string;
    }


    /**
     * Get the value object associated with a key.
     *
     * @param key   A key string.
     * @return      The object associated with the key.
     * @throws      ParserException if the key is not found.
     */
    public Object get(String key) throws ParserException {
        if (key == null) {
            throw new ParserException("Null key.");
        }
        Object object = this.opt(key);
        if (object == null) {
            throw new ParserException("ParserObject[" + quote(key) +
                    "] not found.");
        }
        return object;
    }


    /**
     * Get the boolean value associated with a key.
     *
     * @param key   A key string.
     * @return      The truth.
     * @throws      ParserException
     *  if the value is not a Boolean or the String "true" or "false".
     */
    public boolean getBoolean(String key) throws ParserException {
        Object object = this.get(key);
        if (object.equals(Boolean.FALSE) ||
                (object instanceof String &&
                ((String)object).equalsIgnoreCase("0"))) {
            return false;
        } else if (object.equals(Boolean.TRUE) ||
                (object instanceof String &&
                ((String)object).equalsIgnoreCase("1"))) {
            return true;
        }
        throw new ParserException("ParserObject[" + quote(key) +
                "] is not a Boolean.");
    }


    /**
     * Get the double value associated with a key.
     * @param key   A key string.
     * @return      The numeric value.
     * @throws ParserException if the key is not found or
     *  if the value is not a Number object and cannot be converted to a number.
     */
    public double getDouble(String key) throws ParserException {
        Object object = this.get(key);
        try {
            return object instanceof Number
                ? ((Number)object).doubleValue() :
                (!((String)object).equals("")) ?   
        		Double.parseDouble((String)object) :
                new Double(0);
                //: Double.parseDouble((String)object);
        } catch (Exception e) {
            throw new ParserException("ParserObject[" + quote(key) +
                "] is not a number.");
        }
    }


    /**
     * Get the int value associated with a key.
     *
     * @param key   A key string.
     * @return      The integer value.
     * @throws   ParserException if the key is not found or if the value cannot
     *  be converted to an integer.
     */
    public int getInt(String key) throws ParserException {
        Object object = this.get(key);
        try {
            return object instanceof Number
                ? ((Number)object).intValue() :
                (!((String)object).equals("")) ?   
                Integer.parseInt((String)object) :
            	new Integer(0);
        } catch (Exception e) {
            throw new ParserException("ParserObject[" + quote(key) +
                "] is not an int.");
        }
    }

    /**
     * Get the ParserObject value associated with a key.
     *
     * @param key   A key string.
     * @return      A ParserObject which is the value.
     * @throws      ParserException if the key is not found or
     *  if the value is not a ParserObject.
     */
    public ParserObject getParserObject(String key) throws ParserException {
        Object object = this.get(key);
        if (object instanceof ParserObject) {
            return (ParserObject)object;
        }
        throw new ParserException("ParserObject[" + quote(key) +
                "] is not a ParserObject.");
    }


    /**
     * Get the long value associated with a key.
     *
     * @param key   A key string.
     * @return      The long value.
     * @throws   ParserException if the key is not found or if the value cannot
     *  be converted to a long.
     */
    public long getLong(String key) throws ParserException {
        Object object = this.get(key);
        try {
            return object instanceof Number
                ? ((Number)object).longValue() :
                (!((String)object).equals("")) ?   
        		Long.parseLong((String)object) :
            	new Long(0);
                //: Long.parseLong((String)object);
        } catch (Exception e) {
            throw new ParserException("ParserObject[" + quote(key) +
                "] is not a long.");
        }
    }


    /**
     * Get an array of field names from a ParserObject.
     *
     * @return An array of field names, or null if there are no names.
     */
    public static String[] getNames(ParserObject jo) {
        int length = jo.length();
        if (length == 0) {
            return null;
        }
        Iterator iterator = jo.keys();
        String[] names = new String[length];
        int i = 0;
        while (iterator.hasNext()) {
            names[i] = (String)iterator.next();
            i += 1;
        }
        return names;
    }


    /**
     * Get an array of field names from an Object.
     *
     * @return An array of field names, or null if there are no names.
     */
    public static String[] getNames(Object object) {
        if (object == null) {
            return null;
        }
        Class klass = object.getClass();
        Field[] fields = klass.getFields();
        int length = fields.length;
        if (length == 0) {
            return null;
        }
        String[] names = new String[length];
        for (int i = 0; i < length; i += 1) {
            names[i] = fields[i].getName();
        }
        return names;
    }


    /**
     * Get the string associated with a key.
     *
     * @param key   A key string.
     * @return      A string which is the value.
     * @throws   ParserException if there is no string value for the key.
     */
    public String getString(String key) throws ParserException {
        Object object = this.get(key);
        if (object instanceof String) {
            return (String)object;
        }
        throw new ParserException("ParserObject[" + quote(key) +
            "] not a string.");
    }


    /**
     * Determine if the ParserObject contains a specific key.
     * @param key   A key string.
     * @return      true if the key exists in the ParserObject.
     */
    public boolean has(String key) {
        return this.map.containsKey(key);
    }


    /**
     * Determine if the value associated with the key is null or if there is
     *  no value.
     * @param key   A key string.
     * @return      true if there is no value associated with the key or if
     *  the value is the ParserObject.NULL object.
     */
    public boolean isNull(String key) {
        return ParserObject.NULL.equals(this.opt(key));
    }


    /**
     * Get an enumeration of the keys of the ParserObject.
     *
     * @return An iterator of the keys.
     */
    public Iterator keys() {
        return this.map.keySet().iterator();
    }


    /**
     * Get the number of keys stored in the ParserObject.
     *
     * @return The number of keys in the ParserObject.
     */
    public int length() {
        return this.map.size();
    }

    /**
     * Produce a string from a Number.
     * @param  number A Number
     * @return A String.
     * @throws ParserException If n is a non-finite number.
     */
    public static String numberToString(Number number)
            throws ParserException {
        if (number == null) {
            throw new ParserException("Null pointer");
        }

// Shave off trailing zeros and decimal point, if possible.

        String string = number.toString();
        if (string.indexOf('.') > 0 && string.indexOf('e') < 0 &&
                string.indexOf('E') < 0) {
            while (string.endsWith("0")) {
                string = string.substring(0, string.length() - 1);
            }
            if (string.endsWith(".")) {
                string = string.substring(0, string.length() - 1);
            }
        }
        return string;
    }


    /**
     * Get an optional value associated with a key.
     * @param key   A key string.
     * @return      An object which is the value, or null if there is no value.
     */
    public Object opt(String key) {
        return key == null ? null : this.map.get(key);
    }


    /**
     * Get an optional boolean associated with a key.
     * It returns false if there is no such key, or if the value is not
     * Boolean.TRUE or the String "true".
     *
     * @param key   A key string.
     * @return      The truth.
     */
    public boolean optBoolean(String key) {
        return this.optBoolean(key, false);
    }


    /**
     * Get an optional boolean associated with a key.
     * It returns the defaultValue if there is no such key, or if it is not
     * a Boolean or the String "true" or "false" (case insensitive).
     *
     * @param key              A key string.
     * @param defaultValue     The default.
     * @return      The truth.
     */
    public boolean optBoolean(String key, boolean defaultValue) {
        try {
            return this.getBoolean(key);
        } catch (Exception e) {
            return defaultValue;
        }
    }


    /**
     * Get an optional double associated with a key,
     * or NaN if there is no such key or if its value is not a number.
     * If the value is a string, an attempt will be made to evaluate it as
     * a number.
     *
     * @param key   A string which is the key.
     * @return      An object which is the value.
     */
    public double optDouble(String key) {
        return this.optDouble(key, Double.NaN);
    }


    /**
     * Get an optional double associated with a key, or the
     * defaultValue if there is no such key or if its value is not a number.
     * If the value is a string, an attempt will be made to evaluate it as
     * a number.
     *
     * @param key   A key string.
     * @param defaultValue     The default.
     * @return      An object which is the value.
     */
    public double optDouble(String key, double defaultValue) {
        try {
            return this.getDouble(key);
        } catch (Exception e) {
            return defaultValue;
        }
    }


    /**
     * Get an optional int value associated with a key,
     * or zero if there is no such key or if the value is not a number.
     * If the value is a string, an attempt will be made to evaluate it as
     * a number.
     *
     * @param key   A key string.
     * @return      An object which is the value.
     */
    public int optInt(String key) {
        return this.optInt(key, 0);
    }


    /**
     * Get an optional int value associated with a key,
     * or the default if there is no such key or if the value is not a number.
     * If the value is a string, an attempt will be made to evaluate it as
     * a number.
     *
     * @param key   A key string.
     * @param defaultValue     The default.
     * @return      An object which is the value.
     */
    public int optInt(String key, int defaultValue) {
        try {
            return this.getInt(key);
        } catch (Exception e) {
            return defaultValue;
        }
    }


    /**
     * Get an optional ParserObject associated with a key.
     * It returns null if there is no such key, or if its value is not a
     * ParserObject.
     *
     * @param key   A key string.
     * @return      A ParserObject which is the value.
     */
    public ParserObject optParserObject(String key) {
        Object object = this.opt(key);
        return object instanceof ParserObject ? (ParserObject)object : null;
    }


    /**
     * Get an optional long value associated with a key,
     * or zero if there is no such key or if the value is not a number.
     * If the value is a string, an attempt will be made to evaluate it as
     * a number.
     *
     * @param key   A key string.
     * @return      An object which is the value.
     */
    public long optLong(String key) {
        return this.optLong(key, 0);
    }


    /**
     * Get an optional long value associated with a key,
     * or the default if there is no such key or if the value is not a number.
     * If the value is a string, an attempt will be made to evaluate it as
     * a number.
     *
     * @param key          A key string.
     * @param defaultValue The default.
     * @return             An object which is the value.
     */
    public long optLong(String key, long defaultValue) {
        try {
            return this.getLong(key);
        } catch (Exception e) {
            return defaultValue;
        }
    }




    /**
     * Put a key/boolean pair in the ParserObject.
     *
     * @param key   A key string.
     * @param value A boolean which is the value.
     * @return this.
     * @throws ParserException If the key is null.
     */
    public ParserObject put(String key, boolean value) throws ParserException {
        this.put(key, value ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    /**
     * Put a key/double pair in the ParserObject.
     *
     * @param key   A key string.
     * @param value A double which is the value.
     * @return this.
     * @throws ParserException If the key is null or if the number is invalid.
     */
    public ParserObject put(String key, double value) throws ParserException {
        this.put(key, new Double(value));
        return this;
    }


    /**
     * Put a key/int pair in the ParserObject.
     *
     * @param key   A key string.
     * @param value An int which is the value.
     * @return this.
     * @throws ParserException If the key is null.
     */
    public ParserObject put(String key, int value) throws ParserException {
        this.put(key, new Integer(value));
        return this;
    }


    /**
     * Put a key/long pair in the ParserObject.
     *
     * @param key   A key string.
     * @param value A long which is the value.
     * @return this.
     * @throws ParserException If the key is null.
     */
    public ParserObject put(String key, long value) throws ParserException {
        this.put(key, new Long(value));
        return this;
    }

    /**
     * Put a key/value pair in the ParserObject. If the value is null,
     * then the key will be removed from the ParserObject if it is present.
     * @param key   A key string.
     * @param value An object which is the value. It should be of one of these
     *  types: Boolean, Double, Integer, ParserArray, ParserObject, Long, String,
     *  or the ParserObject.NULL object.
     * @return this.
     * @throws ParserException If the value is non-finite number
     *  or if the key is null.
     */
    public ParserObject put(String key, Object value) throws ParserException {
        if (key == null) {
            throw new ParserException("Null key.");
        }
        if (value != null) {
        	this.map.put(key, value);
        	/*
        	if (this.map.containsKey(key)) {
        		this.map.get(key).add(value);
        	}
        	else {
        		Vector v = new Vector();
        		v.add(value);
        		this.map.put(key, v);
        	}*/
        } else {
            this.remove(key);
        }
        return this;
    }
    
    /**
     * Put a key/value pair in the ParserObject, but only if the key and the
     * value are both non-null, and only if there is not already a member
     * with that name.
     * @param key
     * @param value
     * @return his.
     * @throws ParserException if the key is a duplicate
     */
    public ParserObject putOnce(String key, Object value) throws ParserException {
        if (key != null && value != null) {
            if (this.opt(key) != null) {
                throw new ParserException("Duplicate key \"" + key + "\"");
            }
            this.put(key, value);
        }
        return this;
    }

    
    /**
     * Produce a string in double quotes with backslash sequences in all the
     * right places. A backslash will be inserted within </, producing <\/,
     * allowing Parser text to be delivered in HTML. In Parser text, a string
     * cannot contain a control character or an unescaped quote or backslash.
     * @param string A String
     * @return  A String correctly formatted for insertion in a Parser text.
     */
    public static String quote(String string) {
        StringWriter sw = new StringWriter();
        synchronized (sw.getBuffer()) {
            try {
                return quote(string, sw).toString();
            } catch (IOException ignored) {
                // will never happen - we are writing to a string writer
                return "";
            }
        }
    }

    public static Writer quote(String string, Writer w) throws IOException {
        if (string == null || string.length() == 0) {
            w.write("\"\"");
            return w;
        }

        char b;
        char c = 0;
        String hhhh;
        int i;
        int len = string.length();

        w.write('"');
        for (i = 0; i < len; i += 1) {
            b = c;
            c = string.charAt(i);
            switch (c) {
            case '\\':
            case '"':
                w.write('\\');
                w.write(c);
                break;
            case '/':
                if (b == '<') {
                    w.write('\\');
                }
                w.write(c);
                break;
            case '\b':
                w.write("\\b");
                break;
            case '\t':
                w.write("\\t");
                break;
            case '\n':
                w.write("\\n");
                break;
            case '\f':
                w.write("\\f");
                break;
            case '\r':
                w.write("\\r");
                break;
            default:
                if (c < ' ' || (c >= '\u0080' && c < '\u00a0')
                        || (c >= '\u2000' && c < '\u2100')) {
                    hhhh = "000" + Integer.toHexString(c);
                    w.write("\\u" + hhhh.substring(hhhh.length() - 4));
                } else {
                    w.write(c);
                }
            }
        }
        w.write('"');
        return w;
    }

    /**
     * Remove a name and its value, if present.
     * @param key The name to be removed.
     * @return The value that was associated with the name,
     * or null if there was no value.
     */
    public Object remove(String key) {
        return this.map.remove(key);
    }
    
    /**
     * Try to convert a string into a number, boolean, or null. If the string
     * can't be converted, return the string.
     * @param string A String.
     * @return A simple Parser value.
     */
    public static Object stringToValue(String string) {
        Double d;
        if (string.equals("")) {
            return string;
        }
        if (string.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (string.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        if (string.equalsIgnoreCase("null")) {
            return ParserObject.NULL;
        }

        /*
         * If it might be a number, try converting it.
         * If a number cannot be produced, then the value will just
         * be a string. Note that the plus and implied string
         * conventions are non-standard. A Parser parser may accept
         * non-Parser forms as long as it accepts all correct Parser forms.
         */

        char b = string.charAt(0);
        if ((b >= '0' && b <= '9') || b == '.' || b == '-' || b == '+') {
            try {
                if (string.indexOf('.') > -1 ||
                        string.indexOf('e') > -1 || string.indexOf('E') > -1) {
                    d = Double.valueOf(string);
                    if (!d.isInfinite() && !d.isNaN()) {
                        return d;
                    }
                } else {
                    Long myLong = new Long(string);
                    if (myLong.longValue() == myLong.intValue()) {
                        return new Integer(myLong.intValue());
                    } else {
                        return myLong;
                    }
                }
            }  catch (Exception ignore) {
            }
        }
        return string;
    }
}
