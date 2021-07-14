package cmb;
/*	Create a class named AccountApp that prompts the user for a transaction, posts the transaction, 
 * and displays the information shown in the console output. Create the necessary objects for each 
 * transaction, and post the transaction using the appropriate method of the Transactions class.
* Use the Console class presented in chapter 8 or a variation of it to get entries from the user.
* This application should not allow the user to withdraw more than the current account balance.
* This application should not allow the user to deposit more than $10,000 per transaction.
*/

import java.util.Scanner;
import cmb.CheckingAccount;
import cmb.Transactions;
import cmb.Depositable;
import cmb.Withdrawable;
import cmb.Balanceable;

public class AccountApp {
	/* Author: Piano Hagens 
	 * 03/05/2017	 
	 * */
	public static void main(String[] args)
    {// TODO Auto-generated method stub
		//Display a welcome messages
		System.out.println("Welcome to the Account Calculator");
        System.out.println();
        
		System.out.println("Starting Balance");
		System.out.println("Checking: $1,000.00");
        System.out.println();

        
        //create a scanner to capture user input
        Scanner sc = new Scanner(System.in);        
        String choice = "y";
        System.out.println("Going your Bank account? (y/n):  ");
        //create a loop so to designed play the app or not
        while (choice.equalsIgnoreCase("y")){ 
          	choice = sc.nextLine();
        	System.out.println();
        	
        	//Ask the user want to play?   	
          	System.out.println("Enter the transactions for the month:  \n");
          	System.out.println("Withdrawal or deposit? (w/d):  ");
          	String dw = sc.nextLine();
          	System.out.println("Amount:  ");          	
          	double amount = Double.parseDouble(sc.nextLine());
          	System.out.println(); 
          	
          	String choiceDW = "dw";
         	
          	while (choiceDW.equalsIgnoreCase("w")){ 
          	double balance = 1000;
          	
        	CheckingAccount wd = new CheckingAccount();
        	wd.printInfo();
        	wd.getBalanceFormatted(); 
        	 
	            if(amount > balance)
	            {
	                System.out.println("Can't Withdraw a value greater your balance" );
	                
	            }else {
	            	double finalBalance = balance - amount;
	            	 System.out.println("Withdrawed " + amount +
	                         "\nFinal Balance: " + finalBalance);
	            }
        	 
        	 
        	 while (choiceDW.equalsIgnoreCase("d")){      	
        		 
            	Transactions dp = new Transactions();
            	dp.print();

            
            	if(amount > 10000)
            {
                System.out.println("Can't deposit a value greater than 10000 per transaction" );
               
            }else{
            	double finalBalance = balance + amount;
            	System.out.println("Deposited " + amount +
                        "\nFinal Balance: " + finalBalance);
            }
        	 
        	}
          	}
          	System.out.println("Another transaction? (y/n):  ");  
        	choice = sc.nextLine();
        	System.out.println(); 
        }
        

        //close scanner and Bye
        sc.close();
        System.out.println("Bye"); 
	}
}

