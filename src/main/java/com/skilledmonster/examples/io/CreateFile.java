package com.skilledmonster.examples.io;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		try {
			 
		      File file = new File("c:\\opt\\skilledmonster\\java\\sample.txt");
		
		      if (file.createNewFile()){
		        System.out.println("File is created!");
		      }else{
		        System.out.println("File already exists.");
		      }
	 
	    	} catch (IOException e) {
		      e.printStackTrace();
	    	} 
		

	}

}
