import java.util.Scanner;

/*
	 * Author: Piano Hagens 
	 * Feb 21st, 2017	 
	 */
public class PigLatinTranslateAPP {
	//Parse the string into separate words before translating
	public static String removeContractions(String words){
		if (words.equals("can't")){
			words = words.replace("can't", "cannot");
		}else if(words.equals("won't")){
			words = words.replace("won't", "will not");
		}else if(words.equals("don't")){
			words = words.replace("don't", "do not");
		}else if(words.equals("shouldn't")){
			words = words.replace("shouldn't", "should not");
		}
		return words;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display a welcome messages
		System.out.println("Welcome to the Pig Latin Translator");
        System.out.println();
        
        //create a scanner to capture user input
        Scanner sc = new Scanner(System.in);        
        String choice = "y";        
    	//Ask the user want to play?   	
      	System.out.println("Translate a sentence to Pig Latin? (y/n):  ");
        
        //create a loop so to designed play the app or not
        while (choice.equalsIgnoreCase("y")){
        	choice = sc.nextLine();
        	System.out.println();
        	
        	// Get word to translate from the user.
            System.out.print("Please enter a sentence to translate into Pig Latin: ");            
            String line = sc.nextLine();
            String[] words = line.split(" ");
            
            line = line.toLowerCase();  // convert to lower case so that all
                                        // tests below can be in lower case
        	
         // Determine whether the first character in word is a vowel
            char firstChar = line.charAt(0);  // First index is 0
            String vowels = "aeiouy";
            
         // If firstChar is a vowel then indexOf will return at which index
        	// it appears in the String vowels, otherwise it returns -1
            int vowelIndex = vowels.indexOf(firstChar);  
            boolean firstIsVowel = (vowelIndex >= 0);  
            
         // Print out the word in Pig Latin
            System.out.print("\n\"" + line + "\" in Pig Latin is "); 
                                                 // \n is newline character
                                                 // \" is double quote character
          if (firstIsVowel) {
                System.out.println("\"" + line + "way\"");
            }
            else { // first character is consonant, assuming it is a letter
                String restOfWord = line.substring(1); // all but first character
                System.out.println("\"" + restOfWord + "-" + firstChar + "ay\"");
            }            	
            	//see if the user want to play again   	
              	System.out.println("Translate another line? (y/n):  ");  
            	choice = sc.nextLine();
            	System.out.println();            	
                  	
        }
        //close scanner and Bye
        sc.close();
        System.out.println("Bye"); 
	}
}
