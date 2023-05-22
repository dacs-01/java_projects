/*
 * @author dacs0
 * @version 1.0
 * @since 05/01/2021
 * MATH 1165 - 001
 */
package project3;
import java.util.*;
/**
 * Project 3 - Integer Partitions
 * @author dacs0
 */
public class Project3 
{
	
static int[] numArr = new int[11]; 
// Initialized an array up to the number 11 as the assignment requires numbers between 1 and 10.

	/**
	 * Main code that executes the program using user input.
	 * @param args the command line arguments
	 */
	public static void main(String[] args) 
	{
		// Uses the scanner class to obtain user input.
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a number of your choice from 1 to 10.");
		int n = userInput.nextInt();
		
		// Checks to see if user actually followed directions.
		if (n < 1 || n > 10) {
			System.out.println("Re-run the program and follow instructions por favor.");
			System.exit(0);
		}
		
		System.out.println("");
		calculatePart(n, n, 1);
	}
	
	/**
	 * This method prints each array that holds each calculated partition.
	 * @param n 
	 */
	public static void showPartitions(int n) 
	{
		for (int i = 1; i < n; i++) 
		{
			System.out.print(numArr[i] + " ");
		}
		System.out.println("");
	}
	
	/**
	 * This method calculates all of the possible partitions for a number.
	 * @param n
	 * @param max
	 * @param index 
	 */
	
	public static void calculatePart (int n, int max, int index) 
	{
		// Integer n is equal to the amount that remains to be split as a sum. 
		// If the number n equals zero, it will print out the partitions of the number.
		if (n == 0) 
		{
			showPartitions(index);
		}
		// Max is the maximum value that can be used to begin a partition and is stored as i. 
		// The loop will iterate until max reaches 1.
		for (int i = max; i > 0; --i) 
		{
			// the max value cannot be more than the number n, therefore it will calculate the sum necessary.
			if (i <= n) 
			{
				numArr[index] = i;
				calculatePart(n - i, i, index + 1);
			}
		}
	}
}
