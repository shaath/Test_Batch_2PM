package com.SeleniumProject.JavaProgrammes;

public class MethodsReuseEg {

	public static void main(String[] args) 
	{
//		String res = MethodsEg.Function2();
//		System.out.println(res);
		
		MethodsEg m = new MethodsEg();
//		m.Function3();		
//		System.out.println(m.username);		
//		System.out.println(m.a);
		
		int numRes = m.sum(600, 400);
		System.out.println(numRes);
		
		numRes = m.sum(20, 30, 50);
		System.out.println(numRes);
		
	}

}
