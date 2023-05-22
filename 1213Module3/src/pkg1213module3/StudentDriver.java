/*
 * @author dacs0
 * @version 1.0
 * @since 2021/03/04
 * ITSC1213 156
 */
package pkg1213module3;

/**
 *
 * This class will run off of the Student.java class to output the written code for the lab.
 * @author dacs0
 */
public class StudentDriver {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) 
	{
		System.out.println("********** Part A **********");
		
		Student hakim = new Student();
		System.out.println(hakim.getFirstName());
		System.out.println(hakim.getLastName());
		System.out.println(hakim.getStudentId());
		System.out.println(hakim.getMajor());
		System.out.println(hakim.getGpa());
		System.out.println(hakim.getCredits());
		
		System.out.println("********** Part B **********");
		
		Student maria = new Student("Maria", "Garces", 800555555, "Electrical Engineering", 3.75, 96);
		System.out.println(maria.getFirstName());
		System.out.println(maria.getLastName());
		System.out.println(maria.getStudentId());
		System.out.println(maria.getMajor());
		System.out.println(maria.getGpa());
		System.out.println(maria.getCredits());		
		
		System.out.println("********** Part C **********");
		
		Student torrance = new Student("Torrance", "DeLeon", 800234567, "Aerospace Studies", 3.25, 75); 
		System.out.println("Object torrance first name is " + torrance.getFirstName());
		torrance.setFirstName("Harini");
		System.out.println("Object torrance first name is " + torrance.getFirstName());
	
		System.out.println("********** Part D **********");
		
		Student daniel = new Student("Daniel", "Cisneros", 808080808, "Computer Science", 4.0, 79);
		System.out.println(daniel.getBalance());
		daniel.transferToCard(100.50);
		daniel.transferToCard(-23.57);
		daniel.payFromCard(50.45);
		daniel.payFromCard(200.78);
		
	}
	
}
