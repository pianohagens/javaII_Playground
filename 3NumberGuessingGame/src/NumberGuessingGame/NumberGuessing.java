package NumberGuessingGame;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Welcome message
		System.out.println("Welcom to Number Guessing Game");
		System.out.println();
		
		//the game provides random numbers 
		Random random = new Random();
		
		//random number type is integer range from 1 - 50
		int NumberPool = random.nextInt(50 - 1) + 1;		
				
		// create a Scanner at right under your variable 
		//that keeps track of the number of guesses
		Scanner enteredNumber = new Scanner(System.in);
		int guess;
		
		//create a boolean variable win = false, means the player hasn't won yet. 
		//When win is true, then the player won the game.
		boolean win = false;
		
		// You won't be out of this loop till you guessed out the correct answer
		while (win == false) {			
			//let user enter a number
			System.out.println("Enter the upper limit for the number: 50 ");
			System.out.println("OK, I'm thinking of a number between 0 and 50: ");
			guess = enteredNumber.nextInt();
			
			// if statement if guess =, > , or < NumberPool.
			if (guess == NumberPool){
				win = true;
				System.out.println("Correct! ");
			}
			else if (guess < NumberPool){
				System.out.println("Your guess is too low! ");				
			}
			else if (guess > NumberPool){
				System.out.println("Your guess is too high! ");				
			}			
		}		
		System.out.println("Bye!");		
	}
}
