package com.skilledmonster.examples.util.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
	
		String str [] = new String[5] ;
		
		
		List<String> list = new ArrayList<String>() ;
		
		list.add("Jagadeesh") ;
		list.add("Tejas") ; 
		list.add("Shiva") ;
		
		
		
		List<String> list2 = new ArrayList<String>() ;
		
		
		list2.addAll(list) ;
		
		
		
		
		
		
		System.out.println(list.get(0));
		
		System.out.println(list.get(1));
		
		System.out.println(list.get(2));
		
		System.out.println("Enhanced for loop");
		
		
		for(String s : list ) {
			
			System.out.println(s);
			
		}
		
		System.out.println("Elements from list 2");
		
		for(String s : list2 ) {
			
			System.out.println(s);
			
		}
		
		
		
		
		
	}

}
