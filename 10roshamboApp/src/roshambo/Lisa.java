package roshambo;
import roshambo.RoshamboApp.Roshambo;
public class Lisa extends Player{
	/*
	 * Create classes named Bart and Lisa that inherit the Player class and implement 
	 * the generateRoshambo method. The Bart class should always select rock. The Lisa 
	 * class should randomly select rock, paper, or scissors (a 1 in 3 chance of each).
	 * 
	 */
private Roshambo r;
	
	
	public Roshambo generateRoshambo(String choice)
	{//The Lisa class should randomly select rock, paper, or scissors (a 1 in 3 chance of each).
		switch(choice)
		{
		case "r":
			r = Roshambo.ROCK;
			break;
		case "p":
			r = Roshambo.PAPER;
			break;
		case "s":
			r = Roshambo.SCISSORS;
			break;
		}
		return r;
	}


	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return Roshambo.PAPER;
	}
	
	@Override
	public Roshambo getRoshambo()
	{
		return r;
	}


	   
}
