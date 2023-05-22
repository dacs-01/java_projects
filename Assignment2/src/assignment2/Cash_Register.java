/*
 * @author dacs0
 * @version 1.0
 * @since 03/27/2021
 * ITSC1213 156
 */
package assignment2;
import java.util.*;
/**
 * Programming Assignment 2 - Cash Register
 * 
 * The purpose of this program is to create a fully virtual cash register
 * utilizing array lists and multiple classes.
 * 
 * @author dacs0
 */
public class Cash_Register 
{

	/**
	 * Main driver code that executes all connected classes.
	 * @param args the command line arguments
	 */
	public static void main(String[] args) 
	{
		// Initialize variables and array list objects to be used.
		Scanner scnr = new Scanner(System.in);
		ArrayList<Item> items = new ArrayList<>(); 
		Transaction transaction = new Transaction(items);
		String itemName;
		
		Double cost;
		boolean loop = true;
		String choice = " "; 
		System.out.println("Would you like to buy an item? Enter yes or no.");
		
		// this loop will add items until the user wishes to not buy anything anymore
		while (loop) 
		{
			choice = scnr.nextLine();
			switch (choice) 
			{		
				case "yes":
					System.out.println("What is the name of the item you are trying to buy?");
					itemName = scnr.nextLine();
					System.out.println("How much does it cost?");
					cost = scnr.nextDouble();
					transaction.addItem(itemName, cost);
					System.out.println("Would you like to buy another item?");
					break;
				case "no":
					loop = false;
					break;
				default:
					break;
			}
		}
		// The transaction object will execute its methods accordingly
		transaction.computeSubTotal();
		transaction.computeTax();
		transaction.computeTotal();
		transaction.takePayment();
		transaction.printReceipt();
	}
}
