package com.mimaraslan;

import java.io.File;

import org.apache.tika.Tika;

public class _001_TypedetectionMp3 {

   public static void main(String[] args) throws Exception {

      //assume example.mp3 is in your current directory
      File file = new File("Example.mp3");//
      
      //Instantiating tika facade class 
      Tika tika = new Tika();
      
      //detecting the file type using detect method
      String filetype = tika.detect(file);
      System.out.println(filetype);
   }
}
