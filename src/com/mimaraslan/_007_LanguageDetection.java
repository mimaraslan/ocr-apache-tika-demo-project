package com.mimaraslan;

	import java.io.IOException;

	import org.apache.tika.exception.TikaException;
	import org.apache.tika.language.LanguageIdentifier;

	import org.xml.sax.SAXException;

	public class _007_LanguageDetection {

	   public static void main(String args[])throws IOException, SAXException, TikaException {

	      LanguageIdentifier identifier = new LanguageIdentifier("this is english ");
	      String language = identifier.getLanguage();
	      System.out.println("Language of the given content is : " + language);
	   }
	}
