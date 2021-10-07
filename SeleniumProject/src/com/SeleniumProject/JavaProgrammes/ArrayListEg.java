package com.SeleniumProject.JavaProgrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		
		ArrayList<Object> x = new ArrayList<>();
		
		//Writing the data into Arraylist
		System.out.println(x.isEmpty());
		x.add("Selenium");
		x.add(80000);
		x.add(true);
		x.add('m');
		x.add(252353.44);
		x.add("Selenium");
		x.add(2, 'A');
		
		x.remove(2);
		
		System.out.println(x.isEmpty());
		
		x.set(2, false);
		
		System.out.println(x.size());

//		System.out.println( x.get(2) );
		
		for (int i = 0; i < x.size(); i++)
		{
			System.out.println(x.get(i));
			
		}
	}

}
