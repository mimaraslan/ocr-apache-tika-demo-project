package com.mimaraslan;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;

	import org.apache.tika.exception.TikaException;
	import org.apache.tika.metadata.Metadata;
	import org.apache.tika.parser.AutoDetectParser;
	import org.apache.tika.parser.ParseContext;
	import org.apache.tika.parser.Parser;
	import org.apache.tika.sax.BodyContentHandler;
	import org.apache.tika.language.*;

	import org.xml.sax.SAXException;

	public class _008_DocumentLanguageDetection {

	   public static void main(final String[] args) throws IOException, SAXException, TikaException {

	      //Instantiating a file object
	      File file = new File("Example.txt");

	      //Parser method parameters
	      Parser parser = new AutoDetectParser();
	      BodyContentHandler handler = new BodyContentHandler();
	      Metadata metadata = new Metadata();
	      FileInputStream content = new FileInputStream(file);

	      //Parsing the given document
	      parser.parse(content, handler, metadata, new ParseContext());

	      LanguageIdentifier object = new LanguageIdentifier(handler.toString());
	      System.out.println("Language name :" + object.getLanguage());
	   }
	}