package com.skilledmonster.examples.util.arraylist;

import java.util.HashSet;

public class SetExample {
	public static void main(String[] args) {

		HashSet hSet = new HashSet() ;
		
		hSet.add(new Integer(1)) ;
		
		hSet.add(new Integer(2)) ;
		
		hSet.add(new Integer(3)) ;
		
		hSet.add(new Integer(2)) ;
		
		
		
		System.out.println(hSet.size()); 
		
		hSet.remove(new Integer(2)) ;
		
		
		System.out.println(hSet.size());
		
		
	}

}
