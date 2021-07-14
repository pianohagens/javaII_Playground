package mc;
import mc.ChangeCalculatorApp;


public class GetChange {//start the class definition
	//create instance variable with the input value from the scanner
	private int readInput;
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	
	//start instance methods input and output, set and get
	//instance method of input
    public void setInput(int readInput)
    {
        this.readInput = readInput;
    }    
  //instance method of output
    public int getInput()
    {
    	return readInput;
    }    
  //instance method of output quarters
    public int getQuarter(){
    	int quarters;
    	quarters = readInput / 25;
    	readInput %=25;
    	return quarters;
    }   
  //instance method of output   dimes 
    public int getDimes(){
    	int dimes;
    	dimes = (readInput - quarters) / 10;
    	readInput %=10;
    	return dimes;
    }
  //instance method of output nickels
    public int getNickels(){
    	int nickels;
    	nickels = (readInput - quarters - dimes) / 5;
    	readInput %=5;
    	return nickels;
    }
    
  //instance method of output pennies
    public int getPennies(){
    	int pennies;
    	pennies = readInput - quarters - dimes - nickels;
    	readInput %=1;
    	return pennies;
    }
    
   //convert input validation
   public String getConvert(){
	   String valiInput = "";
		//set up the validation condition
		if (readInput < 1 || readInput >100){
			System.out.println("Please enter a valid number between 1 - 99!");	
			System.out.println();  
			
		}
		return valiInput;
		

		
	   
   }
    

	
}
