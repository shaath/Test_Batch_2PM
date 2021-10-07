package com.SeleniumProject.JavaProgrammes;

public class DynamicArrayEg {

	public static void main(String[] args) 
	{
		int[] salary = new int[5];
		
		System.out.println(salary.length);
		
//		System.out.println(salary[2]);
		
		salary[0] = 80000;
		salary[2] = 100000;
 		salary[0] = 200000;
		
		for (int i = 0; i < salary.length; i++)
		{
			System.out.println(salary[i]);
		}
	}
}
