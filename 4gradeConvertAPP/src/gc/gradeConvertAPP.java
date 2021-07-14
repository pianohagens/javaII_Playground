package gc;
import gc.gradeData;

import java.util.Scanner;

public class gradeConvertAPP {
public static void main(String[] args){
	//TODO Auto generated method stub
		
		//Display a welcome messages
		System.out.println("Welcome to the Letter Grade Converter");
        System.out.println();
        
        //create a scanner
        Scanner scan = new Scanner(System.in);
        String choice = "y";
        
      //create a loop so to contain the App
        while (choice.equalsIgnoreCase("y")){
      //get input from user
    	System.out.println("Please enter a number of you grade: "); 
    	int readInputNumber = Integer.parseInt(scan.nextLine());    	
    	
    	//int readInputNumber = Integer.parseInt(scan.nextLine());
    	
    	//create a gradeData object
    	gradeData gd = new gradeData();
    	gd.setNumber(readInputNumber);
    	
    	
    	String gradeLetter = gd.getLetter();
    	
    	//show result
    	System.out.println("The letter grade is: " + gradeLetter);
    	
    	//see if the user want to enter another grade
    	System.out.println("Would you like to enter another grade? (y/n): ");
    	System.out.println("Press 'y' to countinue, and press 'ENTER' to quit.");
    	choice = scan.nextLine();
    	System.out.println();    			
        
}
        //close scanner and Bye
        scan.close();
        System.out.println("Bye");
	}
}
