/*
 * @author dacs0
 * @version 1.2
 * @since 03/25/2021
 * ITSC1213 156
 */
package lab6projectreboot;

import java.util.ArrayList;

/**
 * Lab 6 - Person/Student Class 
 * 
 * The purpose of this class is to create objects within an array list 
 * and use the subclasses to print out the proper information.
 * 
 * @author dacs0
 */
public class Lab6ProjectReboot {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		//Person p = new Person("Alice", 1000);
		//System.out.println(p);
		
		//Person j = new Professor("Mr. Danny", 1001, "CCI Dept", 45000.50);
		//System.out.println(j);
		
		//Person h = new Student("Andy", 2000, "Computer Science", 4.5);
		//System.out.println(h);
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("Alice", 1000));
		list.add(new Student("Keisha", 900, "CS", 3.5));
		list.add(new Student("Felipe", 901, "English", 3.2));
		list.add(new Professor("Jamika", 300, "CS", 101000.00));
		list.add(new Person("Tala", 1001));
		list.add(new Professor("Julio", 400, "Math", 85000.00));
		list.add(new Student("Huan", 902, "CS", 3.6));
		list.add(new Student("Hank", 903, "Engineering", 3.9));
		list.add(new Student("Mike", 904, "Math", 2.8));
		list.add(new Professor("Azzari", 500, "CS", 100000.00));
		list.add(new Professor("Juan", 600, "CS", 98000.00));
		System.out.println("");
		
		for (Person p: list) { // iterates through the array list to print all objects
			System.out.println(p);
		}
		
		System.out.println("");
		
		for (Person j: list) // iterates through the array list to print object that matches ID number
		{
			if (matchId(j, 903))
			{
				System.out.println(j);
			}
		}
		System.out.println("");
		
		/** Person p = new Student("Keisha", 900, "CS", 3.5);
		if (p instanceof Student)
		{
			System.out.println(((Student)p).getGpa());
		}*/
		for (Person p: list) // iterates through array list and prints out student objects with a GPA above or equal to 3.5
		{
			if (p instanceof Student)
			{
				if (((Student) p).getGpa() >= 3.5)
				{
					System.out.println(p);
				}
			}
		}
		System.out.println("");
		for (Person j: list) { // iterates through array list and prints out professors in CS department
			if (j instanceof Professor)
			{
				if ("CS".equals(((Professor)j).getDepartment()))
				{
					System.out.println(j);
				}
			}
		}
	}
	
	public static boolean matchId(Person p, int id)
	{
		if (p.getId() == id)
		{
			return true;
		}
		return false;
	}
	
}
