// Adil Yousuf Project 2 5/19/2023

import java.util.Scanner;

public class FeetToInches
{

public static void main(String[] args) 
	{
	// variables and constants
		double feet;
		double inches;
		double ConvertNumber;
		Scanner keyboard = new Scanner(System.in);
	//input phase
		System.out.println("How many feet? >> ");
		ConvertNumber = keyboard.nextDouble(); 
		System.out.println("Converting feet to inches is " + (ConvertNumber * 12));

	} // end of main
} // end of class