/*
 * @author dacs0
 * @version 1.0
 * @since
 * ITSC1213 156
 */
package assignment2;

/**
 * This class will be used to create a payment object
 * @author dacs0
 */
public class Payment 
{
	private double val = 0.0;
	private PaymentType payType;
	
/**
 * Constructor that creates a payment object
 * @param type
 * @param amount 
 */
	public Payment(PaymentType type, double amount) 
	{
		payType = type;
		val = amount;
	}
	
/**
 * Gets the value of payment
 * @return val
 */
	public double getVal() 
	{
		return val;
	}
	
/**
 * Sets value of payment
 * @param val 
 */
	public void setVal(double val) 
	{
		this.val = val;
	}
	
/**
 * 
 * @return 
 */
	@Override
	public String toString() 
	{
		return payType + ": $" + val;
	}
	
}
