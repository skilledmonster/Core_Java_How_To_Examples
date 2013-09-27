package com.skilledmonster.examples.io;

import java.io.File;

public class RenameFile {

	public static void main(String[] args) {
		  File oldFile = new File("c:\\opt\\skilledmonster\\java\\sample.txt");
		  File newFile = new File("c:\\opt\\skilledmonster\\java\\sample_renamed.txt");

		if (oldFile.renameTo(newFile)) {
			System.out.println("Rename succesful");
		} else {
			System.out.println("Rename failed");
		}

	}

}
