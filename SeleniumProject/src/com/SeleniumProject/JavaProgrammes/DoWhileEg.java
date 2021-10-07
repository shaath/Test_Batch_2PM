package com.SeleniumProject.JavaProgrammes;

public class DoWhileEg {

	public static void main(String[] args) {
		
		int i = 1;
		
		do
		{
			System.out.println(i);
			if (i == 350) 
			{
				break;
			}
			i++;
		}
		while(i <= 500);

		System.out.println("************");

		int j = 500;
		
		do
		{
			System.out.println(j);
			j--;
		}
		while(j >= 1);
	}

}
