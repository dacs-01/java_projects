/*
 * @author dacs0
 * @version 1.2
 * @since
 * ITSC1213 156
 */
package assignment2;

import java.util.ArrayList;

/**
 * This class prints the receipt of the purchase.
 * @author dacs0
 */
public class Receipt 
{

	// Create two array lists from item and payment classes.
	private ArrayList<Item> items = new ArrayList<>();
	private ArrayList<Payment> payments = new ArrayList<>();

	/**
	 * This method will show the receipt of the transaction.
	 * 
	 * @param list
	 * @param total
	 * @param tax
	 * @param change
	 * @param subTotal
	 * @param payments 
	 */
	public void showReceipt(ArrayList<Item> list, double total, double tax, double change, double subTotal, ArrayList<Payment> payments)
	{
		System.out.println(" ");
		items = list;
		for (int i = 0; i < items.size(); i++) {
			System.out.println("Item " + (i+1) + ": " + items.get(i).toString());
		}
		System.out.println("--------------------------");
		System.out.println("Subtotal: $" + subTotal);
		System.out.println("Tax: $" + tax);
		System.out.println("Total: $" + total);
		for (Payment payment : payments) {
			System.out.println(payments.toString());
		}
		System.out.println("Change: $" + change);
	}
}
