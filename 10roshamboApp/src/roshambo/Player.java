package roshambo;

import roshambo.RoshamboApp.Roshambo;

public abstract class Player {
	/*
	 * Create an abstract class named Player that stores a name and a Roshambo value. 
	 * This class should include an abstract method named generateRoshambo that allows an
	 *  inheriting class to generate and return a Roshambo value. 
	 * It should also include get and set methods for the name and Roshambo value.
	 * 
	 */
	
	//private Roshambo r;
	
	public Player()
	{
		//r = Roshambo.ROCK;
	}
	public abstract Roshambo generateRoshambo();
	public abstract Roshambo getRoshambo();

}
