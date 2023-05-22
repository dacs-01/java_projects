/*
 * @author dacs0
 * @version 1.0
 * @since 2021/03/18
 * ITSC1213 156
 */
package lab5;

import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * This is the class that creates specific methods for driver code to execute.
 * @author dacs0
 */
public class FastFoodKitchen 
{
	private ArrayList<BurgerOrder> orderList = new ArrayList<BurgerOrder>();
	private static int nextOrderNum;

	// Constructor for FastFoodKitchen class
	public FastFoodKitchen() {
		orderList.add(new BurgerOrder(3, 5, 4, 10, false, getNextOrderNum()));
		incrementNextOrderNum();
		
		orderList.add(new BurgerOrder(0, 0, 3, 3, true, getNextOrderNum()));
		incrementNextOrderNum();
		
		orderList.add(new BurgerOrder(1, 1, 0, 2, false, getNextOrderNum()));
		incrementNextOrderNum();
	}
	
	
	/**
	 * Get the value of nextOrderNum
	 *
	 * @return the value of nextOrderNum
	 */
	private static int getNextOrderNum() {
		return nextOrderNum;
	}

	/** 
	 * adds one to the order number
	 * 
	 * @param void
	 */
	private static void incrementNextOrderNum() 
	{
		nextOrderNum += 1;
	}
	
	/**
	 * Adds a new order
	 * 
	 * @param ham
	 * @param cheese
	 * @param veggie
	 * @param soda
	 * @param TOGO
	 * @return orderID
	 */
	public int addOrder(int ham, int cheese, int veggie, int soda, boolean TOGO)
	{
		BurgerOrder order = new BurgerOrder(ham, cheese, veggie, soda, TOGO, getNextOrderNum());
		orderList.add(order);
		int orderID = getNextOrderNum();
		incrementNextOrderNum();
		return orderID;
	}
	
	/**
	 * checks if order is done
	 * 
	 * @param orderID
	 * @return true
	 */
	public boolean isOrderDone(int orderID)
	{
		for (int i = 0; i < orderList.size(); i++)
		{
			if (orderList.get(i).getOrderNum() == orderID)
			{
				return false;
				
			}
		}
		return true;
	}
	
	/**
	 * Calls out order if order is to go
	 * 
	 * @param order 
	 */
	private void orderCallOut(BurgerOrder order)
	{
		if(order.isOrderTogo())
		{
			System.out.println("Hamburgers: " + order.getNumHamburgers());
			System.out.println("Cheeseburgers: " + order.getNumCheeseburgers());
			System.out.println("Veggieburgers: " + order.getNumVeggieburgers());
			System.out.println("Sodas: " + order.getNumSodas());
			System.out.println("Order To Go: " + order.isOrderTogo());
			System.out.println("Order number: " + order.getOrderNum());
		}
	}
	
	/**
	 * Completes a specific order by iterating through the size of the order list.
	 * Removes order if order is complete.
	 * 
	 * @param orderID 
	 */
	private void completeSpecificOrder(int orderID)
	{
		for (int i = 0; i < orderList.size(); i++)
		{
			if (orderList.get(i).getOrderNum() == orderID)
			{
				System.out.println("Order is done.");;
				if (orderList.get(i).isOrderTogo())
				{
					orderCallOut(orderList.get(i));
				}
				orderList.remove(i);
			}
		}
	}
	
	/**
	 * Completes the next order that is assigned to the first element, then is removed.
	 * 
	 * @return void
	 */
	private void completeNextOrder()
	{
		orderList.get(0);
		System.out.println("Order Number: " + orderList.get(0).getOrderNum());
		System.out.println("Order is done.");
		if (orderList.get(0).isOrderTogo())
		{
			orderCallOut(orderList.get(0));
		}
		orderList.remove(0);
	}
	
	/**
	 * Gets the number of orders pending
	 * 
	 * @return orderList.size()
	 */
	public int getNumOrdersPending()
	{
		return orderList.size();
	}
	
	/**
	 * This method simulates kitchen activity by using random numbers less than 100.
	 */
	public void simulateKitchenActivity()
	{
		if (orderList.size() == 0) 
		{
			return;
		}
		int num = (int)(Math.random()*100);
		if (num < 90) 
		{
			completeNextOrder();
		}
		else 
		{
			int size = orderList.size();
			int id = (int)(Math.random()*size);
			completeSpecificOrder(id);
		}
	}
	
	/** 
	 * This method cancels an order that has been started.
	 * @param orderID
	 * @return false
	 */
	public boolean cancelOrder(int orderID)
	{
		for (int i = 0; i < orderList.size(); i++)
		{
			if (orderList.get(i).getOrderNum() == orderID)
			{
				orderList.remove(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "FastFoodKitchen{" + "orderList=" + orderList + '}';
	}
	
}
