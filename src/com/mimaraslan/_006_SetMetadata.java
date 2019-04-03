package com.mimaraslan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Date;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;

import org.xml.sax.SAXException;

public class _006_SetMetadata {

   public static void main(final String[] args) throws IOException,SAXException, TikaException {
   
      //Create a file object and assume example.txt is in your current directory
      File file = new File("Example.txt");
      
      //parameters of parse() method
      Parser parser = new AutoDetectParser();
      BodyContentHandler handler = new BodyContentHandler();
      Metadata metadata = new Metadata();
      FileInputStream inputstream = new FileInputStream(file);
      ParseContext context = new ParseContext();
      
      //Parsing the given file
      parser.parse(inputstream, handler, metadata, context);
     
      //list of meta data elements elements
      System.out.println( " metadata elements and values of the given file :");
      String[] metadataNamesb4 = metadata.names();
      
      for(String name : metadataNamesb4) {
    	  System.out.println(name + ": " + metadata.get(name));
      }
      
      //setting date meta data 
      metadata.set(Metadata.DATE, new Date());
      
      //setting multiple values to author property
      metadata.set(Metadata.AUTHOR, "ram ,raheem ,robin ");
      
      //printing all the meta data elements with new elements
      System.out.println("List of all the metadata elements  after adding new elements ");
      String[] metadataNamesafter = metadata.names();
      
      for(String name : metadataNamesafter) {
         System.out.println(name + ": " + metadata.get(name));
      }
   }
}	