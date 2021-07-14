package roshambo;

import roshambo.RoshamboApp.Roshambo;

public class Bart extends Player{
	/*
	 * Create classes named Bart and Lisa that inherit the Player class and implement 
	 * the generateRoshambo method. The Bart class should always select rock. The Lisa 
	 * class should randomly select rock, paper, or scissors (a 1 in 3 chance of each).
	 * 
	 */

private Roshambo r;
	
	@Override
	public Roshambo generateRoshambo()
	{//The Bart class should always select rock.
		r = Roshambo.ROCK;
		return r;
	}
	@Override
	public Roshambo getRoshambo()
	{
		return r;
	}
	   

}
