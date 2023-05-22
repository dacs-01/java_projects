/*
 * @author dacs0
 * @version 1.0
 * @since 2021/03/18
 * ITSC1213 156
 */
package lab5;

/**
 *
 * This class is designed to be used by the FastFoodKitchen class using getters and setters.
 * @author dacs0
 */
public class BurgerOrder {
	// private fields for BurgerOrder class
	private int numHamburgers = 0;
	private int numCheeseburgers = 0;
	private int numVeggieburgers = 0;
	private int numSodas = 0;
	private boolean orderTogo = false;
	private int orderNum = 1;
	
		/**
	 *
	 * This is the primary constructor for the BurgerOrder class using all created parameters.
	 * @param numHam
	 * @param numCheese
	 * @param numVeggie
	 * @param numPops
	 * @param toGo
	 * @param num
	 */
	public BurgerOrder(int numHam, int numCheese, int numVeggie, int numPops, boolean toGo, int num) 
	{
		numHamburgers = numHam;
		numCheeseburgers = numCheese;
		numVeggieburgers = numVeggie;
		numSodas = numPops;
		orderTogo = toGo;
		orderNum = num;
	}

	/**
	 * Get the value of numHamburgers
	 *
	 * @return the value of numHamburgers
	 */
	public int getNumHamburgers() {
		return numHamburgers;
	}

	/**
	 * Set the value of numHamburgers
	 *
	 * @param numHamburgers new value of numHamburgers
	 */
	public void setNumHamburgers(int numHamburgers) {
		if (numHamburgers < 0)
		{
			System.out.println("Error");
		}
		
		else 
		{
		this.numHamburgers = numHamburgers;
		}
		
	}

	/**
	 * Get the value of numCheeseburgers
	 *
	 * @return the value of numCheeseburgers
	 */
	public int getNumCheeseburgers() {
		return numCheeseburgers;
	}

	/**
	 * Set the value of numCheeseburgers
	 *
	 * @param numCheeseburgers new value of numCheeseburgers
	 */
	public void setNumCheeseburgers(int numCheeseburgers) {
		this.numCheeseburgers = numCheeseburgers;
	}

	/**
	 * Get the value of numVeggieburgers
	 *
	 * @return the value of numVeggieburgers
	 */
	public int getNumVeggieburgers() {
		return numVeggieburgers;
	}

	/**
	 * Set the value of numVeggieburgers
	 *
	 * @param numVeggieburgers new value of numVeggieburgers
	 */
	public void setNumVeggieburgers(int numVeggieburgers) {
		this.numVeggieburgers = numVeggieburgers;
	}


	/**
	 * Get the value of numSodas
	 *
	 * @return the value of numSodas
	 */
	public int getNumSodas() {
		return numSodas;
	}

	/**
	 * Set the value of numSodas
	 *
	 * @param numSodas new value of numSodas
	 */
	public void setNumSodas(int numSodas) {
		this.numSodas = numSodas;
	}

	/**
	 * Get the value of orderTogo
	 *
	 * @return the value of orderTogo
	 */
	public boolean isOrderTogo() {
		return orderTogo;
	}

	/**
	 * Set the value of orderTogo
	 *
	 * @param orderTogo new value of orderTogo
	 */
	public void setOrderTogo(boolean orderTogo) {
		this.orderTogo = orderTogo;
	}

	/**
	 * Get the value of orderNum
	 *
	 * @return the value of orderNum
	 */
	public int getOrderNum() {
		return orderNum;
	}

	/**
	 * Set the value of orderNum
	 *
	 * @param orderNum new value of orderNum
	 */
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	@Override
	public String toString() {
		return "BurgerOrder{" + "numHamburgers=" + numHamburgers + ", numCheeseburgers=" + numCheeseburgers + ", numVeggieburgers=" + numVeggieburgers + ", numSodas=" + numSodas + ", orderTogo=" + orderTogo + ", orderNum=" + orderNum + '}';
	}


}
