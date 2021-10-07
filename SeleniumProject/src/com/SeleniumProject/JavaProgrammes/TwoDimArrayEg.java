package com.SeleniumProject.JavaProgrammes;

public class TwoDimArrayEg {

	public static void main(String[] args) {
		
		Object[][]  data = new Object[2][3];
		
		System.out.println(data.length);
		System.out.println(data[0].length);
		
		data[0][1] = "Selenium";
		data[1][2] = 80000;
		
		for (int i = 0; i < data.length; i++) 
		{
			for (int j = 0; j < data[i].length; j++)
			{
				System.out.println(data[i][j]);
			}
		}

	}

}
