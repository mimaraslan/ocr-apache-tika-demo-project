package com.mimaraslan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;

import org.xml.sax.SAXException;

public class _005_AddMetadata {

	public static void main(final String[] args) throws IOException, SAXException, TikaException {

		// create a file object and assume example.txt is in your current directory
		File file = new File("Example.txt");

		// Parser method parameters
		Parser parser = new AutoDetectParser();
		BodyContentHandler handler = new BodyContentHandler();
		Metadata metadata = new Metadata();
		FileInputStream inputstream = new FileInputStream(file);
		ParseContext context = new ParseContext();

		// parsing the document
		parser.parse(inputstream, handler, metadata, context);

		// list of meta data elements before adding new elements
		System.out.println(" metadata elements :" + Arrays.toString(metadata.names()));

		// adding new meta data name value pair
		metadata.add("Author", "Lala Lolo");
		System.out.println(" metadata name value pair is successfully added");

		// printing all the meta data elements after adding new elements
		System.out.println("Here is the list of all the metadata elements after adding new elements");
		System.out.println(Arrays.toString(metadata.names()));
	}
}