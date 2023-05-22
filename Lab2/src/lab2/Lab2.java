/*
 * @author dacs0
 * @version 1.2
 * @since 2021-02-18
 * ITSC1213 156
 * 
 * Lab 2 - "Lab Dos"
 *
 * This submission will execute three methods (main method, cellPackageCost, and squareDisplay)
 * as required for submission. It will use the scanner class to collect user input in order to
 * execute the methods properly.
 *
 */
package lab2;
import java.util.Scanner;
/**
 *
 * @author dacs0
 */
public class Lab2 
{

	public static void main(String[] args) // main method will execute other methods within the class.
	{
		
		Scanner bro = new Scanner(System.in);
		
		String name;
		int streetNumber;
		String streetName;
		String city;
		
		String state;
		int zip;
		String major;
		int studentId;
		// variables are initialized for scanner to use.
		
		System.out.println("Enter your name");
		name = bro.next(); // user will enter their name here.
		bro.nextLine();
				  
		System.out.println("Enter street number");
		streetNumber = bro.nextInt(); // user will enter their street number here.
		bro.nextLine();
		
		System.out.println("Enter street name");
		streetName = bro.nextLine(); // user will enter their street name here.
		
		System.out.println("Enter your city");
		city = bro.next(); // user will enter their city name here.
		
		System.out.println("Enter your state");
		state = bro.next(); // user will enter their state name here.
		
		System.out.println("Enter your zip code");
		zip = bro.nextInt(); // user will enter their zip code here.
		bro.nextLine();
		
		System.out.println("Enter your major");
		major = bro.nextLine(); // user will enter their major here.
		
		System.out.println("Enter your student ID number");
		studentId = bro.nextInt(); // user will enter their student ID here.
		bro.nextLine();
		
		System.out.println(" ");
		System.out.println("Student Information:");
		System.out.println("Name: " + name);
		
		System.out.println("Address: " + streetNumber + " " + streetName + ",");
		System.out.println(city + ", " + state + " " + zip);
		
		System.out.println("Student ID: " + studentId);
		System.out.println("Major: " + major);
		System.out.println(" ");
		// these print line statements will display the information that the user inputted.
		
		cellPackageCost(bro); // executes method after the main method.
		squareDisplay(bro); // executes method after cellPackageCost method.

	}
	
	/**
	 * 
	 * The purpose of the cellPackageCost method is to calculate the cost of the chosen
	 * package, then comparing it to other packages to see how the user 
	 * could have saved more money.
	 * 
	 * @author dacs0
	 * @param input 
	 * @return void
	 * 
	 */
	
	public static void cellPackageCost(Scanner input) 
	{
		
		System.out.print("Which cell package did you purchase: ");
		char plan = input.next().charAt(0); // user inputs a character for their chosen plan.
		
		System.out.print("How much data was used: ");
		double usage = input.nextDouble(); // user inputs a double for their data usage.
		double A = (usage-3) * 10 + 29.95; // calculates the data usage for package A.
		double B = (usage-5) * 8 + 49.95; // calculates the data usage for package B.
		double C = 69.95; // package C has a fixed price.
		
		if (plan == 'a' || plan == 'A') // checks if user chose package A.
		{
			System.out.println("Total charges for package A: " + A);
			
			if (A > B && A > C) // checks if package A costs more than other packages.
			{
				System.out.println("If you switch to plan B, you could save: $" + (A-B));
				// calculates how much can be saved if switched to package B.
				System.out.println("If you switch to plan C, you could save: $" + (A-C)); 
				// calculates how much can be saved if switched to package C.
			}
		}
		
		if (plan == 'b' || plan == 'B') // checks if user chose package B.
		{
			System.out.println("Total charges for package B: " + B);
			
			if (B > C) // checks if package B costs more than package C.
			{
				System.out.println("If you switch to plan C, you could save: $" + (B-C));
				// calculates how much can be saved if switched to package C.
			}
		}
		
		if (plan == 'c' || plan == 'C') // checks if user chose package C.
		{
			System.out.println("Total charges for package C: " + C);
			System.out.println("You have the most cost-efficient package.");
			// user will be told that they chose the best package.
		}
	
	}
	
	/**
	 * 
	 * The purpose of the squareDisplay method is to display rows of X's
	 * in the shape of a square, using user input. 
	 * 
	 * @author dacs0
	 * @param input 
	 * @return void
	 * 
	 */
	
	public static void squareDisplay(Scanner input) 
	{
		
		System.out.print("Input a positive integer no greater than 15.");
		int num = input.nextInt(); // user will input an integer between 0 and 15.
		
		if (num < 0 || num > 15) // checks if user inputted the correct integer.
		{
			System.out.println("Follow instructions and try again.");
		}
		
		for (int i = 0; i < num; i++) // nested for loop that will print out X's as a square.
		{
			for (int j = 0; j < num; j++)
			{
				System.out.print("X");
			}
			
			System.out.println("");
			
		}
	}
}
