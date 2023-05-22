/*
 * @author dacs0
 * @version 1.0
 * @since 2021/03/05
 * MATH 1165
 */
package project1;
import java.util.Scanner;
/**
 * The purpose of this class is to calculate a Collatz Sequence using 
 * a user-inputted integer collected by the Scanner class.
 * 
 * This program was created and compiled in NetBeans IDE 8.2 Software.
 * 
 * @author dacs0
 */
public class Project1 {

	/**
	 * Main driver method
	 * @param args the command line arguments
	 */
	
	public static void main(String[] args) 
	{
		// The system will tell you to enter any integer.
		System.out.println("Enter a number, then press 'Enter' on your keyboard");
		Scanner input = new Scanner(System.in);
		
		// Declare a length variable that will track the length of the sequence.
		int length = 0;
		int a1 = input.nextInt();
		
		// This while loop will execute until it reaches 1.
		while (a1 != 1)
		{
			// If the variable is even, divide it in half.
			if (a1 % 2 == 0)
			{
				a1 *= .5;
			}
			
			// If the variable is not even, it multiplies it by 3 and adds 1.
			else 
			{
				a1 = 3*a1 + 1;
			}
			
			// After each iteration, length will add one until the end of the loop.
			length++;
			// Prints out calculated integers.
			System.out.print(a1 + " ");
		}
		
		System.out.println(" ");
		// The system will print out the length of the Collatz sequence below the listed integers.
		System.out.println("Length of Collatz sequence is: " + length);
	}
}
