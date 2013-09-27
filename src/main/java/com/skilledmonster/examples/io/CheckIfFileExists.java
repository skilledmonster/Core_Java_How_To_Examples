package com.skilledmonster.examples.io;

import java.io.File;

public class CheckIfFileExists {

	public static void main(String[] args) {
		 File file = new File("c:\\opt\\skilledmonster\\java\\sample.txt");
		 
		  if(file.exists()){
			  System.out.println("File exists!!");
		  }else{
			  System.out.println("File not found!");
		  }

	}

}
