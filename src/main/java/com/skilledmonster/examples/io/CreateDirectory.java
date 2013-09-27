package com.skilledmonster.examples.io;

import java.io.File;

public class CreateDirectory {

	public static void main(String[] args) {
		File file = new File("C:\\opt\\skilledmonster\\java\\sample");
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("Directory is created!");
			} else {
				System.out.println("Failed to create directory!");
			}
		}

		File files = new File("C:\\opt\\skilledmonster\\java\\sample\\sample1\\sample2\\");
		if (!files.exists()) {
			if (files.mkdirs()) {
				System.out.println("Multiple directories are created!");
			} else {
				System.out.println("Failed to create multiple directories!");
			}
		}

	}

}
