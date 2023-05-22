/**
*
* @author dacs0
* @version 1.1
* @since 2021-02-18
* ITSC1213 156
* UserInput Submission - "Cis's Input Class"
* 
* This program is designed to make the user input several variables 
* for the algorithm to process correctly. There are four methods,
* each with different variables and outcomes.
* 
*/
package userinput;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) // The main method will execute the other methods in order.
	{
		Scanner input = new Scanner(System.in); // Creates a keyboard for the user to input values.
			
		testAverage(input);
		System.out.println(" ");
			
		favCity(input);
		System.out.println(" ");
		
		nameAgeSalary(input);
		System.out.println(" ");
		wordGame(input);
		
		// The methods above are called in order to properly execute the desired results for this class using user input.
		
	}
	
	public static void testAverage(Scanner input) // This method calculates the test average of inputted scores.
	{
		
		System.out.println("Enter 3 test scores to be calculated.");
		
		double score1 = input.nextDouble(); // These scores will be used to acquire the user's input.
		double score2 = input.nextDouble();
		double score3 = input.nextDouble();
		double scoreAverage = (score1 + score2 + score3) / 3;	// Calculates the average of the scores.
		
		System.out.println(" ");
		System.out.println("First test score: " + score1);
		System.out.println("Second test score: " + score2);
		System.out.println("Third test score: " + score3);
		System.out.print("Test score average is: " + scoreAverage);

	}
	
	public static void favCity(Scanner input) // This method gives different outputs for the inputted city.
	{
		
		System.out.println(" ");
		System.out.println("Enter the name of your favorite city.");
		String city = input.next(); // The user will enter their favorite city name.
		System.out.println(" ");
		
		System.out.println("Number of characters in city name: " + city.length()); // Gives length of the inputted word.
		System.out.println("City name in uppercase letters: " + city.toUpperCase()); // Uppercases the entire inputted word.
		System.out.println("City name in lowercase letters: " + city.toLowerCase()); // Lowercases the entire inputted word.
		System.out.println("First character in city name: " + city.charAt(0)); // Returns the first letter of the inputted word.
		
	}
	
	public static void nameAgeSalary(Scanner input) // This method gives the name, age, and salary of user's input.
	{
		
		System.out.println("Enter your name.");
		String name = input.next(); // The user will enter their name.
		
		System.out.println("Enter your age.");
		int age = input.nextInt(); // The user will enter their age.
		
		System.out.println("Enter your salary.");
		int salary = input.nextInt(); // The user will enter their salary.
		
		System.out.println(" ");
		System.out.println("My name is " + name + ", " + "and I am " + age + " years old.");
		System.out.println("My annual salary is " + "$" + salary + ".");
		// These print line statements will print out the desired output using the inputted values.
		
	}
	
	public static void wordGame(Scanner input) // This method is like a word game, using multiple inputted variables as fill-in-the-blanks.
	{
		System.out.println("Enter your name.");
		String name = input.next(); // The user will enter their name.
		
		System.out.println("Enter your age.");
		int age = input.nextInt(); // The user will enter their age.
		
		System.out.println("Enter your city name.");
		String city = input.next(); // The user will enter their city.
		
		System.out.println("Enter your college name.");
		String college = input.next(); // The user will enter their college.
		
		System.out.println("Enter your profession.");
		String prof = input.next(); // The user will enter their profession.
		
		System.out.println("Enter your type of pet.");
		String petType = input.next(); // The user will enter their type of pet.
		
		System.out.println("Enter your pet's name.");
		String petName = input.next(); // The user will enter their pet's name.
	
		
		System.out.println(" ");
		System.out.println("There once was a person named " + name + " who lived in " + city + ".");
		System.out.println("At the age of " + age + ", " + name + " went to college at " + college + ".");
		System.out.println(name + " graduated and went to work as a " + prof + ".");
		System.out.println("Then, " + name + " adopted a(n) " + petType + " named " + petName + ".");
		System.out.println("They both lived happily ever after!");
		// These print line statements are used to give the desired output for this part of the class.

	}

}
