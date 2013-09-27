package com.skilledmonster.examples.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileUsingFileInputStream {

	public static void main(String[] args) {

		File file = new File("c:\\opt\\skilledmonster\\java\\sample.txt");
		FileInputStream fis = null;

		try {
			fis = new FileInputStream(file);

			System.out.println("Total file size to read (in bytes) : "
					+ fis.available());

			int content;
			while ((content = fis.read()) != -1) {
				// convert to char and display it
				System.out.print((char) content);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
