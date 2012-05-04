package com.github.clentfort.dota2.parser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.PosixParser;

import com.github.clentfort.dota2.dota.Abilities;
import com.github.clentfort.dota2.dota.Heroes;
import com.github.clentfort.dota2.dota.Items;
import com.github.clentfort.dota2.dota.Units;

public class Parser {
	public static final String FILE_UNITS = "npc_units.txt";
	public static final String FILE_HEROES = "npc_heroes.txt";
	public static final String FILE_ABILITIES = "npc_abilities.txt";
	public static final String FILE_ITEMS = "items.txt";
	
	public Parser(File input, File output, Class type) {
		try {
			FileInputStream inputStream = new FileInputStream(input);
			FileOutputStream outputStream = new FileOutputStream(output);
			ParserTokener tokener = new ParserTokener(inputStream);
			ParserObject object = new ParserObject(tokener);
			Object list;
			
			if (type.equals(Units.class))  list = ParserConverter.toUnits(object);
			else if (type.equals(Heroes.class)) list = ParserConverter.toHeroes(object);
			else if (type.equals(Abilities.class)) list = ParserConverter.toAbilities(object);
			else return;

			JAXBContext context = JAXBContext.newInstance(type);
			Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://clentfort.github.com/dota2/dota dota.xsd");
			marshaller.marshal(list, outputStream);
			outputStream.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Options options = new Options();
		options.addOption(OptionBuilder.hasArg(true)
							.isRequired()
							.withLongOpt("input")
							.withDescription("The file to parse")
							.withType(String.class)
							.create("i"));
		options.addOption(OptionBuilder.hasArg()
							.isRequired()
							.withLongOpt("output")
							.withDescription("The output directory")
							.withType(String.class)
							.create("o"));
		options.addOption(OptionBuilder.hasArg()
							.withLongOpt("type")
							.withDescription(
									"The type of information stored in the file to parse, if no " +
									"type is given the parser assumes to guess the type from the" +
									" input filename")
							.withType(String.class)
							.create());
		
		try {
			PosixParser posixParser = new PosixParser();
			CommandLine commandLine = posixParser.parse(options, args);
			File input	= new File((String)(commandLine.getParsedOptionValue("input")));
			File output	= new File((String)(commandLine.getParsedOptionValue("output")));
			Class type;
			if (commandLine.hasOption("type")) {
				type = Class.forName((String)(commandLine.getParsedOptionValue("type")));
			}
			else {
				if (input.getName().equals(FILE_UNITS)) {
					type = Units.class;
				}
				else if (input.getName().equals(FILE_HEROES)) {
					type = Heroes.class;
				}
				else if (input.getName().equals(FILE_ABILITIES)) {
					type = Abilities.class;
				}
				else if (input.getName().equals(FILE_ITEMS)) {
					type = Items.class;
				}
				else {
					throw new ClassNotFoundException("Could not determine type from filename");
				}
					
			}
			new Parser(input, output, type);
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
