/*
 * @author dacs0
 * @version 1.0
 * @since 2021/03/04
 * ITSC1213 156
 */
package pkg1213module3;

/**
 * 
 * The purpose of the Student class is to be utilized for the Student Driver class with setters and getters.
 * @author dacs0
 */
public class Student 
{
	private String firstName;
	private String lastName;
	private int studentId;
	private String major;
	private double gpa;
	private int credits;
	private double balance;
	
	/**
	 *
	 * This is the primary constructor for the Student class using all created parameters.
	 * @param fName
	 * @param lName
	 * @param id
	 * @param mjr
	 * @param gp
	 * @param creds
	 */
	public Student (String fName, String lName, int id, String mjr, double gp, int creds)
	{
		this.firstName = fName;
		this.lastName = lName;
		this.studentId = id;
		this.major = mjr;
		this.gpa = gp;
		this.credits = creds;
		
	}

	/**
	 *
	 * default constructor
	 */
	public Student() 
	{
		
	}
	
	/**
	 * This method just gets the first name.
	 * @return firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 *
	 * This method just gets the last name.
	 * @return lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * 
	 * This method just gets the student ID.
	 * @return studentId
	 */
	public int getStudentId()
	{
		return studentId;
	}

	/**
	 *
	 * This method just gets the major.
	 * @return major
	 */
	public String getMajor()
	{
		return major;
	}

	/**
	 *
	 * This method just gets the GPA.
	 * @return gpa
	 */
	public double getGpa()
	{
		return gpa;
	}

	/**
	 *
	 * This method just gets the credits.
	 * @return
	 */
	public int getCredits()
	{
		return credits;
	}	
	
	/**
	 *
	 * This method sets a new first name.
	 * @param fName
	 */
	public void setFirstName(String fName)
	{
		firstName = fName;
	}
	
	/**
	 *
	 * This method sets a new last name.
	 * @param lName
	 */
	public void setLastName(String lName)
	{
		lastName = lName;
	}
	
	/**
	 * 
	 * This method sets a new student ID.
	 * @param id
	 */
	public void setStudentId(int id)
	{
		studentId = id;
	}
	
	/**
	 * 
	 * This method sets a new major.
	 * @param mjr
	 */
	public void setMajor(String mjr)
	{
		major = mjr;
	}
	
	/**
	 *
	 * This method sets a new GPA.
	 * @param gp
	 */
	public void setGpa(double gp)
	{
		gpa = gp;
	}
	
	/**
	 *
	 * This method sets a new amount of credits.
	 * @param creds
	 */
	public void setCredits(int creds)
	{
		credits = creds;
	}	
	
	/**
	 *
	 * @return balance
	 */
	public double getBalance ()
	{
		return balance;
	}
	
	/**
	 *
	 * This method adds an amount to balance if greater than 0.
	 * @param amount
	 */
	public void transferToCard(double amount)
	{
		if (amount < 0)
		{
			System.out.println("The transfer amount must be greater than 0");
		}
		
		else
		{
		balance += amount;
		System.out.println("New balance is: " + balance);
		}
	}
	
	/**
	 *
	 * This method subtracts an amount to balance if amount is less than or equal to balance.
	 * @param amount
	 */
	public void payFromCard(double amount)
	{
		if (amount > balance)
		{
			System.out.println("Sorry, your balance is too low!");
		}
		
		else
		{
		balance -= amount;
		System.out.println("New balance is: " + balance);
		}
	}
}
