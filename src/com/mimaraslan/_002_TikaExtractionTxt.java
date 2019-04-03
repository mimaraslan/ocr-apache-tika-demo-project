package com.mimaraslan;

import java.io.File;
import java.io.IOException;
import org.apache.tika.Tika;
import org.apache.tika.exception.TikaException;

public class _002_TikaExtractionTxt {
	public static void main(final String[] args) throws IOException, TikaException {

	      //Assume example.txt is in your current directory		        
	      File file = new File("Example.txt");
	      
	      //Instantiating Tika facade class
	      Tika tika = new Tika();
	      String filecontent = tika.parseToString(file);
	      System.out.println("Extracted Content: " + filecontent);
	   }	
}
