/*
 * @author dacs0
 * @version 1.2
 * @since 03/22/2021
 * ITSC1213 156
 */
package shoppingcartprinter;
import java.util.*;

/**
 * Online Shopping Cart - Extended with ArrayLists
 * 
 * The purpose of this code is to get user input to execute different commands within an online shopping cart.
 * @author dacs0
 */
public class ShoppingCartManager {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) 
	{
		// Declare variables to be used throughout program.
		Scanner scnr = new Scanner(System.in);
		String custName = "none";
		String date = "January 1, 2016";
		String input = " ";
		
		String name;
		String description;
		int price;
		int quantity;

		System.out.println("Enter Customer's Name:");
		custName = scnr.nextLine();
		System.out.println("Enter Today's Date:");
		date = scnr.nextLine();
		
		System.out.println("");
		ShoppingCart customer = new ShoppingCart(custName, date);
		System.out.println("Customer Name: " + custName);
		System.out.println("Today's Date: " + date);

	
		// calls the menu method within the driver code.
		printMenu();
		while(true)
		{
			input = scnr.nextLine();

				switch(input) // switch code will use string user input to execute commands.
				{


					case "q":
						System.exit(0);
						break;

					case "a": // adds an item to cart
						System.out.println("ADD ITEM TO CART");
						System.out.println("Enter the item name:");
						name = scnr.nextLine();
						System.out.println("Enter the item description:");
						
						description = scnr.nextLine();
						System.out.println("Enter the item price:");
						price = scnr.nextInt();
						System.out.println("Enter the item quantity:");
						
						quantity = scnr.nextInt();
						customer.addItem(name, price, quantity, description);
						printMenu();
						break;		

					case "r": // removes an item from cart
						System.out.println("REMOVE ITEM FROM CART");
						System.out.println("Enter name of item to remove:");
						String item = scnr.nextLine();
						
						customer.removeItem(item);
						printMenu();
						break;

					case "c": // changes item quantity
						System.out.println("CHANGE ITEM QUANTITY");
						System.out.println("Enter the item name:");
						name = scnr.nextLine();
						
						System.out.println("Enter the new price:");
						price = scnr.nextInt();
						System.out.println("Enter the new quantity:");
						
						quantity = scnr.nextInt();
						System.out.println("Enter the new description");
						description = scnr.nextLine();
						
						customer.modifyItem(name, price, quantity, description);
						printMenu();				
						break;

					case "d": // prints out the items' descriptions
						System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
						customer.printDescriptions();
						printMenu();
						break;

					case "s": // prints out the shopping cart details
						System.out.println("OUTPUT SHOPPING CART");
						customer.printTotal();
						printMenu();
						break;

			}
		}
	}
	// this method prints out the menu to tell user what to input
	public static void printMenu()
	{
	   System.out.println();
	   System.out.println("MENU");
      System.out.println("a - Add item to cart");
		
      System.out.println("r - Remove item from cart");
      System.out.println("c - Change item quantity");
      System.out.println("d - Output items' descriptions");
		
      System.out.println("s - Output shopping cart");
      System.out.println("q - Quit");
		System.out.println(" ");
		System.out.println("Choose an option:");
	}
}

	
	

