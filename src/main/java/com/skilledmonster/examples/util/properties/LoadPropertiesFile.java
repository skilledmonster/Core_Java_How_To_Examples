package com.skilledmonster.examples.util.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertiesFile {

	public static void main(String[] args) {
	
		Properties prop = new Properties();
		
		try {
			
			//load properties file from classpath
			
			prop.load(new FileInputStream("C://Workspace//Personal//GitHub//Core_Java_How_To_Examples//src//main//resource//skilledmonster.properties")) ;
			
			//display values
	
			System.out.println(prop.get("username"));
			
			System.out.println(prop.get("password"));
			
			System.out.println(prop.get("connection.timeout.interval"));
			
			
		} catch(IOException e) {
			e.printStackTrace() ; 
		}
		
	}

}
