package com.SeleniumProject.JavaProgrammes;

public class ObjectEg {

	public static void main(String[] args) {
		
		Object[] x = {"Selenium", 80000, 25230.32, true, 'M'};
		
		System.out.println(x.length);
		
		System.out.println(x[2]);
		
		for (Object data : x)
		{
			System.out.println(data);
		}
		
	}

}
