package com.SeleniumProject.JavaProgrammes;

public class InterfaceEgMethodsResuse {

	public static void main(String[] args) {
		
		InterfaceEg im1 = new InterfaceImplementsEg1();
		
		im1.vehicle();
		
		InterfaceEg im2 = new InterfaceImplementsEg2();
		im2.vehicle();

	}

}
