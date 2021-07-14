package mc;

import java.util.Scanner;
import mc.GetChange;

public class ChangeCalculatorApp {	
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Display a welcome messages
		System.out.println("Welcome to the Change Calculator");
        System.out.println();
       
      //create a scanner
        Scanner readInputNumber = new Scanner(System.in);
        String choice = "y";
        
        //create a loop so to contain the App
        while (choice.equalsIgnoreCase("y")){
       

      //get input from user
        System.out.println("Please Enter number of cents (1-99): ");
        int readInput = Integer.parseInt(readInputNumber.nextLine());
        
        //create a GetChange object
        GetChange cc = new GetChange();
        cc.setInput(readInput);       
        
        //call out from GetChange object to local object.
		String vali = cc.getConvert();
		int quarters = cc.getQuarter();
		int dimes = cc.getDimes();
		int nickels = cc.getNickels();
		int pennies = cc.getPennies();


       	//show result
      	System.out.println("You entered: " + readInput  +" cents.\n\n" + 
      	"Quarters: " + quarters +"\n" +  
                "Dimes   : " + dimes + "\n" +   
                "Nickels : " + nickels + "\n" +   
                "Pennies : " + pennies);
      	
    	//see if the user want to enter another grade   	
      	System.out.println("Would you like to enter another number? (y/n): ");  
    	choice = readInputNumber.nextLine();
    	System.out.println();  
        }
        //close scanner and Bye
        readInputNumber.close();
        System.out.println("Bye");  

	}
	

}
