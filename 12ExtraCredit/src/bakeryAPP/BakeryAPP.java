package bakeryAPP;

import java.util.Scanner;
import bakeryAPP.addToCart;
import bakeryAPP.Exchange;

public class BakeryAPP {
	/*
	 * *Author: Piano Hagens
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display a welcome messages
		System.out.println("Welcome to the bakery");
        System.out.println();

        //create a scanner to capture user input
        Scanner sc = new Scanner(System.in);        
        String choice = "y";  
        
    	//Ask the user want to shop?   	
      	System.out.println("Would you like to shop? y/n:  ");
        
       
        while (choice.equalsIgnoreCase("y")){ 
        	choice = sc.nextLine();
        	System.out.println(); 
        	
        	
        	// show menu
          	System.out.println("Thank you for choosing to shop  \n");
          	System.out.println("Our Specials Today Are:");
          	System.out.println("Cookies - $1.00 each");
          	System.out.println("Pie - 	$2.00 per slice");
          	System.out.println("Cake -	$3.00 per slice\n");
          	
        	
            Scanner scQuantity = new Scanner(System.in);        
            
        	//Let user enter quantity.	
          	System.out.println("How many cookies would you like?  \n");          	
          	int cookieQuantity = Integer.parseInt(scQuantity.nextLine());
          	
          	System.out.println("How many slices of pie would you like?  \n");          	
          	int pieQuantity = Integer.parseInt(scQuantity.nextLine());
          	
          	System.out.println("How many slices of cake would you like? \n");          	
          	int cakeQuantity = Integer.parseInt(scQuantity.nextLine());
          	

      	         	
        	System.out.println();  
        	if (pieQuantity > 0 || cakeQuantity > 0 || cookieQuantity > 0){
        		//create addToCart object
        		addToCart toCart = new addToCart();
        		
        		//call out the data
        		toCart.getPieSubtotal(pieQuantity, pieQuantity); 
        		double pieSub = toCart.getPieSubtotal(pieQuantity, pieQuantity);
        		
        		toCart.getCakeSubtotal(cakeQuantity, cakeQuantity);
        		double cakeSub = toCart.getCakeSubtotal(cakeQuantity, cakeQuantity);

        		
        		toCart.getCookieSubtotal(cookieQuantity, cookieQuantity);
        		double cookieSub = toCart.getCookieSubtotal(cookieQuantity, cookieQuantity); 
        		
        		toCart.getTotal(pieQuantity, cakeQuantity, cookieQuantity);
        		double totalAll = pieSub + cookieSub + cakeSub;
        		
        		//show result
        		System.out.println("You have selected " + cookieQuantity + " Cookies, " + "Cookies Subtotal is: " + cookieSub + "  dollars." );
        		System.out.println("You have selected " + pieQuantity + " slice of Pies, " + "Pie Subtotal is: " + pieSub + "  dollars." );
        		System.out.println("You have selected " + cakeQuantity + " slice of Cakes, " + "Cakes Subtotal is: " + cakeSub + "  dollars.\n" );        		
        		
        		System.out.println("Your total is:  " + totalAll + " dollars.\n" );        		
            	//Please Enter a Whole Dollar Amount Greater Than the Order Total  	
              	System.out.println("\nPlease Enter a Whole Dollar Amount Greater Than the Order Total:  "); 
              	double enterAmount = Double.parseDouble(sc.nextLine());
            	System.out.println(); 
            	
            	double changes = enterAmount - totalAll;
            	 if(enterAmount > totalAll){           		 
                     //show result              	
                     
                 	System.out.println("Thank you for shopping, You have entered: " + enterAmount + " dollars\n");
                 	System.out.println("Your total is : " + totalAll + " dollars\n" );
                 	System.out.println("Your change is : " + changes + " dollars\n" );
                 	System.out.println("Thanks for dropping by...GoodBye\n\n"); 
            		
                 	//if enter not enough money
            	 }else if(enterAmount < totalAll){  
            		 System.out.println("\nPlease Enter Amount Greater Than the Order Total:  "); 
            	 }
        		
        	}else if (pieQuantity < 1 || cakeQuantity < 1 || cookieQuantity < 1){
        		System.out.println("You must enter a whole number for quantities\n" );        		
        	}
        		            	            	
            	//see if the user want to play again   	
              	System.out.println("Would you like to continue? y/n:  ");  
            	choice = sc.nextLine();
            	System.out.println();            	
                  	
        }
        //close scanner and Bye
        sc.close();
        System.out.println("Thanks for dropping by...GoodBye"); 
	}

}
