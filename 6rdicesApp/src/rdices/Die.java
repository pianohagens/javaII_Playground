package rdices;

public class Die {
	/*Create a class named Die to store the data about each die. This class should contain these constructors and methods:
	public Die()              // default to a six-sided die
	public Die(int sides)     // allow a variable number of sides
	public void roll()
	public int getValue()
	*/
		
		//create instance variable
		private int dieFaces;
		private int rollOneDieValue;
		
		public Die(){//default constructor here to call the roll() method to roll
			// default to a six-sided die sides = 6;
			dieFaces = 6;			 
		}
				
		public Die(int side){//ordinary constructors
			// allow a variable number of sides		
			if (side > 0 && side <= 6)
			dieFaces = side;
		}
		
		public void roll(){	//create roll method
			rollOneDieValue = (int) (Math.random() * dieFaces) + 1;
			
		}
		
		public int getValue(){
			
			return rollOneDieValue;
			
		}


	

}
