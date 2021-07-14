package rdices;

public class PairOfDice {
	/*Create a class named PairOfDice to store two dice. This class should contain two instance variables of the Die type, an instance variable that holds the sum of the two dice, and these constructors and methods:
public PairOfDice()           // default to six-sided dice
public PairOfDice(int sides)  // allow a variable number of sides
public void roll()
public int getValue1()        // get value of die1
public int getValue2()        // get value of die2
public int getSum()           // get the sum of both dice
*/
	
	//create instance variable
	private int dieFaces;
	   private int getValue1;   // Instance variable for number showing on the first die.
	   private int getValue2;   // Instance variable for number showing on the second die.
	   private int sum;    // Instance variable to hold sum of two dice
	
	public PairOfDice(){//default constructor here to call the roll() method to roll
		// default to a six-sided die sides = 6;
		dieFaces = 6;			 
	}
			
	public PairOfDice(int side){
		// allow a variable number of sides		
		if (side > 0 && side <= 6)
		dieFaces = side;
	}
	public void roll(){	//create roll method 
		getValue1 = (int)(Math.random()*dieFaces) + 1;
		getValue2 = (int)(Math.random()*dieFaces) + 1; 
		
	}
	// get value of die1
	public int getValue1(){
		this.getValue1 = (int)(Math.random()*dieFaces) + 1;
		return getValue1;
        }
	// get value of die2
	public int getValue2(){
		this.getValue2 = (int)(Math.random()*dieFaces) + 1;
		return getValue2;
        }
	

	// get the sum of both dice
	public int getSum(){
		sum = getValue1 + getValue2;
		return sum;
		
	}	

}
