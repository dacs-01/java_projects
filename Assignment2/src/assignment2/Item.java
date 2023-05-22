/*
 * @author dacs0
 * @version 1.2
 * @since
 * ITSC1213 156
 */
package assignment2;

/**
 *
 * @author dacs0
 */
public class Item 
{
	private String itemName;
	private double itemPrice;

	/**
	 * Default constructor
	 */
	public Item() 
	{
		itemName = "none";
		itemPrice = 0.0;
	}

	/**
	 * Constructor for item object
	 * @param itemName
	 * @param itemPrice 
	 */
	public Item(String itemName, double itemPrice) 
	{
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	/**
	 * Gets item name
	 * @return 
	 */
	public String getItemName() 
	{
		return itemName;
	}

	/**
	 * sets item name
	 * @param itemName 
	 */
	public void setItemName(String itemName) 
	{
		this.itemName = itemName;
	}

	/** 
	 * gets item price
	 * @return 
	 */
	public double getItemPrice() 
	{
		return itemPrice;
	}

	/**
	 * sets item price
	 * @param itemPrice 
	 */
	public void setItemPrice(double itemPrice) 
	{
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() 
	{
		return (itemName + ", Price: " + itemPrice);
	}
	
	
}
