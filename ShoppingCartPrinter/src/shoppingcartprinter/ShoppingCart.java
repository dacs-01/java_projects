/*
 * @author dacs0
 * @version 1.2
 * @since
 * ITSC1213 156
 */
package shoppingcartprinter;

import java.util.ArrayList;

/**
 * Shopping Cart Class
 * @author dacs0
 */
public class ShoppingCart 
{
	private String customerName;
	private String currentDate;
	private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();
	private ItemToPurchase item = new ItemToPurchase();
	
	public ShoppingCart() // default constructor
	{
		customerName = "none";
		currentDate = "January 1, 2016";
	}
	
	// Constructor for shopping cart class with customer name and date as paramenters.
	public ShoppingCart(String cName, String date)
	{
		customerName = cName;
		currentDate = date;
	}
	
	public String getCustomerName() // gets the customer's name
	{
		return customerName;
	}
	
	public String getDate() // gets the current date
	{
		return currentDate;
	}
	
	public void addItem(String name, int price, int quantity, String description) // adds a new item to the shopping cart
	{
		ItemToPurchase item = new ItemToPurchase(name, price, quantity, description);
		cartItems.add(item);
	}
	
	public void removeItem(String itemNombre) // removes an item from the shopping cart
	{
		for (int i = 0; i < cartItems.size(); i++)
		{
			item = cartItems.get(i);
			if (itemNombre == item.getName())
			{
				cartItems.remove(i);
			}
			
			else 
			{
				System.out.println("Item not found in cart. Nothing modified");
			}
		}
	}
	
	public void modifyItem(String name, int price, int quantity, String description) // changes an item within the cart
	{
		
		for (int i = 0; i < cartItems.size(); i++)
		{
			item = cartItems.get(i);
			if (name == item.getName())
			{
				if (description == "none")
				{
					item.setDescription(description);
				}
				if (price == 0)
				{
					item.setPrice(price);
				}
				if (quantity == 0)
				{
					item.setQuantity(quantity);
				}
			}
			else 
			{
				System.out.println("Item not found in cart. Nothing modified");
			}
		}
	}
	
	public int getNumItemsInCart() // gets the number of items in the cart
	{
		int numItemsInCart = 0;
		for (int i = 0; i < cartItems.size(); i++)
		{
			item = cartItems.get(i);
			numItemsInCart += item.getQuantity();
		}
		return numItemsInCart;
	}
	
	public int getCostOfCart() // gets the cost of the cart
	{
		int totalCostOfCart = 0;
		for (int i = 0; i < cartItems.size(); i++)
		{
			item = cartItems.get(i);
			totalCostOfCart += (item.getPrice() * item.getQuantity());
		}
		return totalCostOfCart;
	}
	
	public void printTotal() // prints the total cost of the cart, along with the prices and quantities of items
	{
		System.out.println(getCustomerName() + "'s Shopping Cart - " + getDate());
		System.out.println("Number of Items: " + getNumItemsInCart());
		if (getNumItemsInCart() == 0)
		{
			System.out.println("Shopping cart is empty.");
		}
		else
		{
			for (int i = 0; i < cartItems.size(); i++)
			{
				System.out.println(item.getName() + " " + item.getQuantity() + " @ $" + item.getPrice() + " = " + (item.getPrice() * item.getQuantity()));
			}
			System.out.println(" ");
			System.out.println("Total: $" + getCostOfCart());
		}
	}
	
	public void printDescriptions() // prints the descriptions of the items in the cart
	{
		System.out.println(getCustomerName() + "'s Shopping Cart - " + getDate());
		for (int i = 0; i < cartItems.size(); i++)
		{
			item = cartItems.get(i);
			item.printItemDescription();
		}
	}
}
