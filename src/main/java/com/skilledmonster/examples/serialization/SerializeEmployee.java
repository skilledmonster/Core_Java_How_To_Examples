package com.skilledmonster.examples.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.skilledmonster.examples.common.pojo.Employee;

public class SerializeEmployee {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setName("skilledmonster");
		e.setAddress("Stamford, CT");
		e.setSSN("123-45-6789");
		e.setEmpId(12345);

		try {
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.println("Object Serialization Complete!!");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}