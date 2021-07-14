package murach.movies;
import murach.movies.MovieDB;

import java.util.Scanner;

import murach.movies.Movie;

public class MovieListerApp {

	/*
	 * Author: Piano Hagens 
	 * 03/13/2017	 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display a welcome messages
		System.out.println("Welcome to the Movie Lister");
        System.out.println();
        
		System.out.println("There are 100 movies in the list.");
        System.out.println();
        
        //create a scanner to capture user input
        Scanner sc = new Scanner(System.in);        
        String choice = "y";        
    	//Ask the user want to play?   	
      	System.out.println("Want to take a look what we have? (y/n):  ");
        
        //create a loop so to designed play the app or not
            
            while (choice.equalsIgnoreCase("y")){         	
                
            	
            	choice = sc.nextLine();
            	System.out.println(); 
            	
              	System.out.println("What category are you interested in? :  ");
              	      	
            	System.out.println();             	

            		
                	        	
                  
           
            	            	
            	//see if the user want to play again   	
              	System.out.println("Continue? (y/n):   ");  
            	choice = sc.nextLine();
            	System.out.println();            	
            }      	
        
        //close scanner and Bye
        sc.close();
        System.out.println("Bye"); 
	}

}
