/*
 * @author dacs0
 * @version 1.2
 * @since
 * ITSC1213 156
 */
package assignment2;

import java.util.*;

/**
 * This is the primary class that executes all of the calculations for the main driver.
 * 
 * @author dacs0
 */
public class Transaction 
{
	private ArrayList<Payment> payments;
	private ArrayList<Item> items;
	private double subTotal;
	private double change;
	private double tax;
	private double total;

	/**
	 * default constructor
	 */
	public Transaction() 
	{
		items = new ArrayList<Item>();
		payments = new ArrayList<Payment>();
		subTotal = 0.0;
	}
	
	/**
	 * Constructor using item array list
	 * @param items 
	 */
	public Transaction (ArrayList<Item> items) 
	{
		this.items = items;
		this.payments = new ArrayList<>();
		subTotal = 0.0;
	}
	
	/**
	 * adds an item with name and price
	 * @param name
	 * @param price 
	 */
	public void addItem (String name, double price) 
	{
		items.add(new Item(name, price));
	}
	
	/**
	 * adds a payment with type and amount
	 * @param type
	 * @param amount 
	 */
	public void addPayment (PaymentType type, double amount) 
	{
		payments.add(new Payment(type, amount));
	}
	
	/**
	 * calculates the subtotal
	 */
	public void computeSubTotal() 
	{
		for (int i = 0; i < items.size(); i++) 
		{
			subTotal += items.get(i).getItemPrice();
		}
	} 
	
	/**
	 * calculates the tax
	 * @return tax
	 */
	public double computeTax() 
	{
		return tax = subTotal * 0.07;
	}

	/**
	 * calculates the total
	 * @return total
	 */
	public double computeTotal() 
	{
		return total = subTotal + tax;
	}
	
	/**
	 * gets the total
	 * @return total
	 */
	public double getTotal() 
	{
		return total;
	}

	/**
	 * gets the subtotal
	 * @return subtotal
	 */
	public double getSubTotal() 
	{
		return subTotal;
	}

	/**
	 * gets the change
	 * @return change
	 */
	public double getChange() 
	{
		return change;
	}

	/**
	 * gets the tax
	 * @return tax
	 */
	public double getTax() 
	{
		return tax;
	}
	
	/**
	 * prints the receipt using a receipt object
	 */
	public void printReceipt() 
	{
		Receipt rcpt = new Receipt();
		rcpt.showReceipt(items, computeTotal(), tax, change, subTotal, payments);
	}
	
	/**
	 * primary method that takes the payment desired to execute
	 */
	public void takePayment() 
	{
		// initialize variables and objects
		Scanner scnr = new Scanner(System.in);
		int type;
		double amtLeft = 0.0;
		
		double paid;
		Payment payments;
		PaymentType paymentType = null;
		
		// loop that prints item description
		for (int i = 0; i < items.size(); i++) 
		{
			System.out.println("Item " + (i+1) + ": " + items.get(i).toString());
		}
		System.out.println("Total: " + getTotal());
		
		// loop that asks for user's payment method(s) until total is at or below 0
		while (total > 0) 
		{
			
			System.out.println("Enter payment type:");
				System.out.println("1. Cash\n" + "2. Debit Card\n" + "3. Credit Card\n" + "4. Check\n");
				type = scnr.nextInt();
				switch (type) 
				{
					case 1:
						paymentType = PaymentType.CASH;
						break;
					case 2:
						paymentType = PaymentType.DEBIT_CARD;
						break;
					case 3: 
						paymentType = PaymentType.CREDIT_CARD;
						break;
					case 4:
						paymentType = PaymentType.CHECK;
						break;
			}		
				System.out.println("Enter an amount to pay with this type.");
				paid = scnr.nextDouble();
				payments = new Payment(paymentType, paid);
				total -= paid;
				System.out.println("Total after payment: " + total);
		}
		
		// this will collect the amount of change left from the total (if below 0)
		if (total < 0) 
		{
			change = Math.abs(total);
		}
	}
	
}
