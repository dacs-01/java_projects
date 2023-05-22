/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.ArrayList;

/**
 * The PhoneBook class utilizes an ArrayList to execute the different methods 
 * that will be used in the test harness (Start.java) main class.
 * 
 * @author dacs0
 */
public class PhoneBook {
   //  
   private ArrayList<PhoneBookEntry> list;
    
   public PhoneBook() {
      list = new ArrayList<PhoneBookEntry>();
   }
   /**
	 * Gets an entry from the phone book array list
	 * @param name
	 * @return 
	 */
   public PhoneBookEntry getEntry(String name) {
      PhoneBookEntry entry = null;
      for(PhoneBookEntry e: list) {
         if(e.getName().equals(name)) {
                entry = e;
         }
      }
      return entry;
   }
    /**
	  * Adds an entry from the phone book array list
	  * @param name
	  * @param number 
	  */
   public void addEntry(String name, String number) {
      PhoneBookEntry entry = new PhoneBookEntry(name, number);
      list.add(entry);
   }
    /**
	  * Removes an entry from the phone book array list
	  * @param name 
	  */
   public void removeEntry(String name) {
      PhoneBookEntry entry = getEntry(name);
      if(entry != null) {
         list.remove(entry);
         System.out.println("Entry has been removed");
      }
      else
         System.out.println("Entry cannot be found");
   }
    /**
	  * Edits an entry from the phone book array list
	  * @param name
	  * @param number 
	  */
   public void editEntry(String name, String number) {
      PhoneBookEntry entry = getEntry(name);
      if(entry != null) {
         entry.setPhonenumber(number);
         System.out.println("Entry has been updated");
      }
      else {
         System.out.println("Entry cannot be found");
      } 
   }
    /**
	  * Searches the phone number from an entry using the entry's name
	  * @param name
	  * @return 
	  */
   public String searchPhoneNumber(String name) {
      String result = null;
      PhoneBookEntry entry = getEntry(name);
      if(entry != null) {
         result = entry.getPhoneNumber();
      }
      return result;
   }
    /**
	  * prints out the phone book list
	  */
   public void printBook() {
      System.out.println("\n\nPhone Book");
      for(PhoneBookEntry e: list) {
         e.printPhoneBookEntry();
      }
   }
}

