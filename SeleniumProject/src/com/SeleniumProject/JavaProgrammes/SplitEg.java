package com.SeleniumProject.JavaProgrammes;

public class SplitEg {

	public static void main(String[] args) 
	{
		String s = "I&am&earning&Java";
		
		String[] sArray =  s.split("&");
		
//		System.out.println(sArray[2]);
		
		for (int i = 0; i < sArray.length; i++)
		{
			System.out.println(sArray[i]);
		}

	}

}
