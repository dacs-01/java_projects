/*
 * @author dacs0
 * @version 1.0
 * @since 2021/03/11
 * ITSC1213 156
 * Lab 4: User Input with Try/Catch - "Lab Quatro" 
 */
package lab4project;
import java.io.*;
import java.util.*;
/**
 *
 * The purpose of this class is to utilize user input and 
 * make sure the correct variables are inputted using try/catch.
 * @author dacs0
 */
public class Lab4Project 
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) 
	{
		// Main method will call the respective methods to gain user input.
		addUserInput();
		divideUserInput();
		divideFromFile();
	}
	
	// Method will use user input to print out the sum of the input.
	public static void addUserInput() 
	{
		// Declare variables to be used in method
		Scanner scnr = new Scanner(System.in);
		int one = 0;
		int two = 0;
		int sum = 0;
		boolean again = true;
		
		while (again) // The while loop will excute until the condition is false.
		{
			System.out.println("Please enter an integer.");
			try // The user will input an integer. If done correctly, the while loop will stop.
			{
				one = scnr.nextInt();
				again = false;
			}
			catch (InputMismatchException a) // The catch statement will check if the user inputted a non-integer.
			{
				System.out.println("Invalid input."); // If caught, it will print out invalid input.
				scnr.nextLine();
			}
		}
		again = true; // The condition is set to true once more for the second loop.
		while (again)
		{
			System.out.println("Please enter a second integer.");
			try // The user will input an integer. If done correctly, the while loop will stop.
			{
				two = scnr.nextInt();
				again = false;
			}
			catch (InputMismatchException a) // The catch statement will check if the user inputted a non-integer.
			{
				System.out.println("Invalid input."); // If caught, it will print out invalid input.
				scnr.nextLine();
			}
		}
		sum = one + two; // This calculates the sum of the inputted integers.
	   System.out.println("The sum is: " + sum);
	}
	
	// Method will use user input to print out the quotient of the input.
	public static void divideUserInput()
	{
		// Declare variables to be used in method
		Scanner scnr = new Scanner(System.in);
		int uno = 0;
		int dos = 0;
		int division = 0;
		boolean again = true;
		
		while (again) 
		{
			System.out.println("Please enter an integer.");
			try // The user will input an integer. If done correctly, the while loop will stop.
			{
				uno = scnr.nextInt();
				again = false;
			}
			catch (InputMismatchException a) // The catch statement will check if the user inputted a non-integer.
			{
				System.out.println("Invalid input."); // If caught, it will print out invalid input.
				scnr.nextLine();
			}
		}
		again = true; // The condition is set to true once more for the second loop.
		while (again) 
		{
			System.out.println("Please enter an integer divisor.");
			try // The user will input a non-zero integer. If done correctly, the while loop will stop.
			{
				dos = scnr.nextInt();
				division = uno / dos; // Calculates the division of both integers.
				again = false;
			}
			catch (ArithmeticException b) // The catch statement will check if the user inputted a zero for denominator.
			{
				System.out.println("Invalid arithmetic."); // If caught, it will print out invalid arithmetic.
				scnr.nextLine();
			}
			catch (InputMismatchException c) // The catch statement will check if the user inputted a non-integer.
			{
				System.out.println("Invalid input."); // If caught, it will print out invalid input.
				scnr.nextLine();
			}
		}
		System.out.println("The quotient is: " + division);
	}
	
	// Method will use user input to print out the quotient of the input from a file.
	public static void divideFromFile()
	{
		// Declare variables to be used in method
		Scanner scnr = new Scanner(System.in);
		boolean again = true;
		double quotient = 0;

		while (again) // same as above.
		{
			try 
			{
				System.out.println("Please enter a filename.");
				String filename = scnr.nextLine();
				File myFile = new File(filename); // Creates a file object using the filename.
				
				Scanner fileScan = new Scanner(myFile); // This will scan the file for input.
				double one = fileScan.nextDouble();
				fileScan.next();
				
				double two = fileScan.nextDouble();
				quotient = one / two; // same as previous method.
				System.out.println("The quotient is: " + quotient);
				again = false;
			}
			catch (FileNotFoundException d) // This checks for the invalid file name.
			{
				System.out.println("Invalid file name.");
			}
			catch (InputMismatchException e) // This checks for invalid values in the file.
			{
				System.out.println("Invalid values.");	
			}
			catch (ArithmeticException f) // This checks for zeroes in the file.
			{
				System.out.println("Invalid arithmetic.");
			}
		}
	}
}
