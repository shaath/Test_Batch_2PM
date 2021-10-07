package com.SeleniumProject.JavaProgrammes;

public class PolyndromeStringEg {

	public static void main(String[] args) {
		String p = "madam";  // madam
		String r = "";
		int len = p.length();
		
		for (int i = len-1 ; i >= 0; i--)
		{			
			r = r + p.charAt(i);					//	muineleS
			
		}
		System.out.println(r);
		
		if (p.equalsIgnoreCase(r)) 
		{
			System.out.println("The given string is polyndrome");
		}
		else
		{
			System.out.println("The given is not a plyndrome");
		}
	}

}
