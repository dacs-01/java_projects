/*
 * @author dacs0
 * @version 1.0
 * @since 2021/03/12
 * ITSC1213 156
 */
package shoppingcartprinter;
import java.util.*;
/**
 * Shopping Cart Printer - "SCP Class"
 * This driver class is designed to compute different aspects of two items using user input.
 * @author dacs0
 */
public class ShoppingCartPrinter 
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) // Main method of class.
	{
		// Declare a scanner and two item objects.
		Scanner scnr = new Scanner(System.in);
		ItemToPurchase item1 = new ItemToPurchase();
		ItemToPurchase item2 = new ItemToPurchase();
		
		// Declare the variables used for user input.
		String name;
		int price = 0;
		int quantity = 0;
		
		// Prints out user input instructions for the first item. 
		System.out.println("Item 1");
		System.out.println("Enter the item name:");
		name = scnr.nextLine();
		System.out.println("Enter the item price:");
		
		price = scnr.nextInt();
		System.out.println("Enter the item quantity:");
		quantity = scnr.nextInt();
		System.out.println("");
		
		// Sets the respective qualities of the first item with user inputted values.
		item1.setName(name);
		item1.setPrice(price);
		item1.setQuantity(quantity);
		scnr.nextLine();
		
		// Prints out user input instructions for the second item.
		System.out.println("Item 2");
		System.out.println("Enter the item name:");
	   name = scnr.nextLine();
		System.out.println("Enter the item price:");
		
		price = scnr.nextInt();
		System.out.println("Enter the item quantity:");
		quantity = scnr.nextInt();
		System.out.println("");
		
		// Sets the respective qualities of the second item with user inputted values.
		item2.setName(name);
		item2.setPrice(price);
		item2.setQuantity(quantity);
		
		// Creates total variables for each and both items
		int item1Total = item1.getPrice() * item1.getQuantity();
		int item2Total = item2.getPrice() * item2.getQuantity();
		int total = item1Total + item2Total;
		
		// Prints out the necessary information of both items and the total.
		System.out.println("TOTAL COST");
		System.out.print(item1.getName() + " " + item1.getQuantity());
		System.out.println(" @ $" + item1.getPrice() + " = $" + item1Total);
		
		System.out.print(item2.getName() + " " + item2.getQuantity());
		System.out.println(" @ $" + item2.getPrice() + " = $" + item2Total);
		System.out.println("Total: $" + total);
	}
}
