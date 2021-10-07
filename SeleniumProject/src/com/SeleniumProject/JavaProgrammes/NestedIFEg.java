package com.SeleniumProject.JavaProgrammes;

public class NestedIFEg {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 200;
		
		if(a > b & a > c)
		{
			System.out.println("A i greater");
		}
		else if(b > c & b > a)
		{
			System.out.println("B is greater");
		}
		else if (c > a & c > b)
		{
			System.out.println("C is greater");
		}
		else
		{
			System.out.println("Give valid values");
		}

	}

}
