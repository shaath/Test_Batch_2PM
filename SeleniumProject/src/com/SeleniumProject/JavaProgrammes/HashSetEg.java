package com.SeleniumProject.JavaProgrammes;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEg {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<>();
		
		h.add("Selenium");
		h.add("Doll");
		h.add("God");
		h.add("Cool");
		h.add("Selenium");
		
		h.remove("Cool");
		
//		Iterator<String> it = h.iterator();
//		
//		while(it.hasNext())
//		{
//			String data = it.next();
//			System.out.println(data);
//		}
		
		for (String data : h) 
		{
			System.out.println(data);
		}

	}

}
