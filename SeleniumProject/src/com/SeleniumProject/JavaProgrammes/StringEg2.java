package com.SeleniumProject.JavaProgrammes;

public class StringEg2 {

	public static void main(String[] args) {
		String course = "You are selected Selenium";
		int count= 0;
		int len = course.length();
		
		for (int i = 0; i < len; i++) {
			
			char c = course.charAt(i);
			
			for (int j = 0; j < len; j++) {
				char x = course.charAt(j);
				if (c == x)
				{
					count++;    // count = count + 1; 
				}
			}
			System.out.println(c+ " count in course is : "+count);
			count= 0;
		}
	}

}
