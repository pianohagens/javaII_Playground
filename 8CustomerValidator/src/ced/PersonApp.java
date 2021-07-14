package ced;
import ced.Customer;
import ced.Employee;
import ced.Validator;
import ced.Validator;

import java.util.Scanner;
public class PersonApp {
	/*
	 * Author: Piano Hagens 
	 * Feb 28th, 2017
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
Create a class named PersonApp that prompts the user as shown in the console output. 
This class should create the necessary Customer and Employee objects from the 
data entered by the user, and it should use these objects to display the data to the user. 
To print the data for an object to the console, this application should use a static method 
named print that accepts a Person object.
⦁	Use the Console class from chapter 8 or a variation of it to get entries from the user.
 */
		 System.out.println("Welcome to the Person Tester application");
		 
		 Scanner sc = new Scanner(System.in);	 
		 String choice = "";
		 String EmOrCu = "";
		 
	     do {    	
	        	// get the input from the user
	    	 EmOrCu = Validator.getCorE(sc, "\nCreate customer or employee? (c/e): ");
	    	 if (EmOrCu.equalsIgnoreCase("c")) {
	    		 Customer c = new Customer();
	    		 System.out.println("Enter first name: ");
	    		 c.setFirstName(sc.next());
	    		 System.out.println("Enter last name: ");
	    		 c.setLastName(sc.next());
	    		 c.setEmail(Validator.getEmailAdd(sc, "Enter email address: "));
	    		 System.out.println("Enter customer number: ");
	    		 c.setCustNo(sc.next());
	    		 System.out.println("\nYou Entered:");
	    		 System.out.println(c.getDisplayText());
	    	 }	
	    	 else
	    	 {
	    		 Employee e = new Employee();
	    		 System.out.println("Enter first name: ");
	    		 e.setFirstName(sc.next());
	    		 System.out.println("Enter last name: ");
	    		 e.setLastName(sc.next());
	    		 e.setEmail(Validator.getEmailAdd(sc, "Enter email address: "));
	    		 e.setSSNo(Validator.getSSno(sc, "Social security number: "));
	    		 System.out.println("\nYou Entered:");
	    		 System.out.println(e.getDisplayText());
	    	 }
	    	 choice = Validator.getYorN(sc, "Continue? (y/n): ");
	     } while (choice.equalsIgnoreCase("y"));
	}
		

	}


