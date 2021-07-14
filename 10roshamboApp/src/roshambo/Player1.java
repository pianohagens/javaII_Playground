package roshambo;

import roshambo.RoshamboApp.Roshambo;

public class Player1 extends Player{
	/*
	 * Create a class named Player1 that inherits the Player class and 
	 * implements the generateRoshambo method (even though it isn’t necessary 
	 * for this player). This method can return any value you choose.
	 * */
	 
private Roshambo r;
	
	@Override
	public Roshambo generateRoshambo()
	{
		r = Roshambo.values()[(int)(Math.random() * 3)];
		return r;
	}
	
	@Override
	public Roshambo getRoshambo()
	{
		return r;
	}

}