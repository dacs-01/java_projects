/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;
import java.io.*;
import java.util.*;		  

/**
 * Test Harness - Digital Phone Book
 * 
 * The purpose of this project is to test a digital phone book using
 * a list that offers certain features that you would do with a phone book.
 * 
 * 04/30/21
 * @author dacs0
 */
public class Start {
	/**
	 * Main driver method that executes the initialize and displayMenu methods. 
	 * @param args 
	 */
    public static void main(String[] args) {
        
        PhoneBook book = new PhoneBook();
        initialize(book);
		  displayMenu();
    }
    
	 /**
	  * Adds three entries to the PhoneBook book ArrayList.
	  * @param book 
	  */
    public static void initialize(PhoneBook book) {
        book.addEntry("Roxanne Hughes", "443-555-2864");
        book.addEntry("Juan Alberto Jr.", "410-555-9385");
        book.addEntry("Rachel Phillips", "310-555-6610");
    }
	 
	 /**
	  * Displays a menu using a switch statement and while loop. 
	  * It also prompts the user to enter a number between 0-5.
	  */
	 public static void displayMenu() {
		PhoneBook book = new PhoneBook();
		boolean loop = true;
		 
		 
		while (loop) 
		{
			try { // Try-catch statement used to check if correct input was used.
				Scanner sc = new Scanner(System.in);
				System.out.println("Please select from the following menu of options, by typing a number:");
				System.out.println("\t 1. Add an entry");
				System.out.println("\t 2. Edit an entry");
				System.out.println("\t 3. Look up phone number");
				System.out.println("\t 4. Remove an entry");
				System.out.println("\t 5. Print out phone book");
				System.out.println("\t 0. Exit");

				int choice = sc.nextInt();
				switch (choice) 
				{
					case 1: // Adds an entry with user input of a name and number
						System.out.println("Add a name");
						String name = sc.next();
						sc.nextLine();
						System.out.println("Add a number");
						String number = sc.nextLine();
						book.addEntry(name, number);
						System.out.println("Book added!");
						break;

					case 2: // Edits an entry with user input of a name and number 
						System.out.println("What's the name of the entry?");
						name = sc.next();
						sc.nextLine();
						System.out.println("What will be new the number?");
						number = sc.nextLine();
						book.editEntry(name, number);
						break;

					case 3: // Looks up a phone number using user input of a name
						System.out.println("What's the name you're looking for?");
						name = sc.next();
						System.out.println("The number is: " + book.searchPhoneNumber(name));
						break;

					case 4: // Removes an entry using user input of a name
						System.out.println("What entry would you like to remove, starting from the name?");
						name = sc.next();
						sc.nextLine();
						book.removeEntry(name);
						break;

					case 5: // Prints out the phone book
						book.printBook();
						break;

					case 0: // Exits the phone book
						loop = false;
						break;
					}
				}
		 
			catch (InputMismatchException ime) 
			{
			 System.out.println("Enter a number, don't be ridiculous.");
			}
		}
	}
}
