package rdices;

import java.util.Scanner;

import rdices.Die;
import rdices.PairOfDice;

public class DiceRollerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display a welcome messages
		System.out.println("Welcome to the Dice Roller");
        System.out.println();

      //create a scanner to capture user input
        Scanner sc = new Scanner(System.in);        
        String choice = "y";
        
    	//Ask the user want to play?   	
      	System.out.println("Roll the dice? (y/n):  ");

        
        //create a loop so to designed play the app or not
        while (choice.equalsIgnoreCase("y")){
       
        	
        	//int rollOneDice;
        	choice = sc.nextLine();
        	System.out.println();
        	//initicalise the time of been rolled.
        	int numberOfRolledCount;
        	numberOfRolledCount = 0;
            //create another loop to disigne play 1 die or 2 dices
            while (choice.equalsIgnoreCase("y")){
            	
            	numberOfRolledCount++;
            	//Let user design to play 1 die or 2 dice   	
              	System.out.println("Want to roll one die or two dices? Enter a number 1 or 2:  ");
              	int roll1DieOr2Dice = Integer.parseInt(sc.nextLine());            	
            	System.out.println(); 
            	
            	System.out.println("Roll " + numberOfRolledCount + ":");
            	//if a die
            	if (roll1DieOr2Dice == 1){
            		
            		//call out Die class Object for rolling 1 Die
                	Die d1 = new Die();
                	d1.roll();
                	//create a local variable
                	int rollValue1Die = d1.getValue();
                	
                  	
                	//show result if rolled one die                  	
                    if (rollValue1Die == 1)
                        System.out.println("Rolled One Die, roll value is: " + rollValue1Die + " ->Circle!" + "\n");
                    else if (rollValue1Die == 3)
                        System.out.println("Rolled One Die, roll value is: " + rollValue1Die + " ->Triangle!" + "\n");
                    else if (rollValue1Die == 4)
                        System.out.println("Rolled One Die, roll value is: " + rollValue1Die + " ->Square!" + "\n");
                    else{//other result  then 1,3,4.
                    	System.out.println("Rolled One Die, roll value is: " + rollValue1Die + "\n");
                    	
                    }
                    	
            	
                    //call out PairOfDice class Object for rolling 2 Dices
            	}else if (roll1DieOr2Dice == 2){
            		//call out PairOfDice class object.
            		PairOfDice d2 = new PairOfDice();            		
            		d2.getValue1();
            		d2.getValue2();
            		d2.getSum();
            		
            		//create variable to hold the Objects
            		int rollVal1 = d2.getValue1();
            		int rollVal2 = d2.getValue2();
            		int sumValue2 = d2.getSum();
            		
                	//show result if rolled 2 dices
            		//2-5,Craps
                    if (rollVal1 == 2 && rollVal2 == 5)
                    	System.out.println(rollVal1 + "\n" + rollVal2 + "\n" + "Craps!\n" + "Rolled Two Dices, Total Value: " + sumValue2);
                        
                    //1-1,  Snake eyes!  
                    else if (rollVal1 == 1 && rollVal2 == 1)
                    	System.out.println(rollVal1 + "\n" + rollVal2 + "\n" + "Snake eyes!\n" + "Rolled Two Dices, Total Value: " + sumValue2);
                        
                    //6-6 Box cars!   
                    else if (rollVal1 == 6 && rollVal2 == 6)
                    	System.out.println(rollVal1 + "\n" + rollVal2 + "\n" + "Box cars!\n" + "Rolled Two Dices, Total Value: " + sumValue2);
                       
            	
                else{//other value but 2-5, 1-1, and 6-6
                	System.out.println(rollVal1 + "\n" + rollVal2 + "\n" + "Rolled Two Dices, Total Value: " + sumValue2);
                	
                }
            	}
            	//see if the user want to play again   	
              	System.out.println("\nRoll again? (y/n): ");  
            	choice = sc.nextLine();
            	System.out.println();
            	
            }
        	
        }
        //close scanner and Bye
        sc.close();
        System.out.println("Bye"); 
}}
