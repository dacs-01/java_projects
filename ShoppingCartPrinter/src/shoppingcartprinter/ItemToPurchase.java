/*
 * @author dacs0
 * @version 1.0
 * @since 2021/03/22
 * ITSC1213 156
 */
package shoppingcartprinter;

/**
 * Item To Purchase - "ITP"
 * This class creates mutators and accessors as a part of the ShoppingCart class.
 * @author dacs0
 */
public class ItemToPurchase 
{
	// Private fields for the class.
	private String itemName;
	private int itemPrice;
	private int itemQuantity;
	private String itemDescription;
	
	public ItemToPurchase()
	{
	// Fields are set to required values in default constructor.
	itemName = "none";
	itemPrice = 0;
	itemQuantity = 0;
	itemDescription = "none";
	}
	
	public ItemToPurchase(String name, int price, int quantity, String description)
	{
	itemName = name;
	itemPrice = price;
	itemQuantity = quantity;
	itemDescription = description;
	}
	
	public void setName(String name) // Method that sets the name.
	{
		itemName = name;
	}
	
	public String getName() // Method that gets the name.
	{
		return itemName;
	}
	
	public void setPrice(int price) // Method that sets the price.
	{
		itemPrice = price;
	}
	
	public int getPrice() // Method that gets the price.
	{
		return itemPrice;
	}
	
	public void setQuantity(int quantity) // Method that sets the quantity.
	{
		itemQuantity = quantity;
	}
	
	public int getQuantity() // Method that gets the quantity.
	{
		return itemQuantity;
	}
	
	public String getDescription()
	{
		return itemDescription;
	}
	
	public void setDescription(String description)
	{
		itemDescription = description;
	}
	
	public void printItemCost()
	{
		System.out.println(itemName + " " + itemQuantity + "@ $" + itemPrice + " = $" + (itemPrice * itemQuantity));
	}
	
	public void printItemDescription()
	{
		System.out.println(itemName + ": " + itemDescription + ".");
	}
	
}
