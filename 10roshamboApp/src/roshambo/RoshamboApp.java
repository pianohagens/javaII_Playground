package roshambo;


import java.util.Scanner;

import roshambo.Bart;
import roshambo.Lisa;
import roshambo.Player;
import roshambo.Player1;
import roshambo.Roshambo;

public class RoshamboApp {
	/*
	 * Author: Piano Hagens
	 * Date: Mar 12th, 2017
	 * 
	 * Create a class named RoshamboApp that allows the player to play Bart or Lisa as 
	 * shown in the console output. Rock should beat scissors, 
	 * paper should beat rock, and scissors should beat paper.
	 */

	enum Roshambo
	{
		ROCK, PAPER, SCISSORS;
		public String toString()
		{
			switch(this)
			{
			case ROCK:
				return "rock";
			case PAPER:
				return "paper";
			case SCISSORS:
				return "scissors";
			default:
				return "";
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = "";
		String player1 = "";
		String team = "";
		String answer = "";
		Player b;
		Lisa l = new Lisa();
		Roshambo pick;
		Roshambo cpuPick;
		System.out.println("Welcome to the game of Roshambo");
		name = Validator.getString(sc, "Enter your name: ");
		team = Validator.getTeam(sc, "Would you like to play Bart or Lisa? (b/l): ");
		
		if(team.equalsIgnoreCase("b"))
		{
			b = new Bart();
			b = (Bart)b;
			player1 = "Bart";
		}
		else if(team.equalsIgnoreCase("l"))
		{
			b = new Player1();
			b = (Player1)b;
			player1 = "Lisa";
		}
		else
		{
			b = new Bart();
			b = (Bart)b;
		}
		do
		{
			// get  Validate
			answer = Validator.getSelection(sc, "Rock, paper, or scissors? (r/p/s):");
			l.generateRoshambo(answer);
			b.generateRoshambo();
			pick = l.getRoshambo();
			cpuPick = b.getRoshambo();
			System.out.println(name + ": " + pick.toString());
			System.out.println(player1 + ": " + cpuPick.toString());
			if(pick == b.getRoshambo())
			{
				System.out.println("Draw");
			}
			else if(pick == Roshambo.PAPER)
			{
				if(cpuPick == Roshambo.ROCK)
				{
					System.out.println(name + " Wins!");
				}
				else if(cpuPick == Roshambo.SCISSORS)
				{
					System.out.println(player1 + " Wins!");
				}
			}
			
			else if(pick == Roshambo.ROCK)
			{
				if(cpuPick == Roshambo.SCISSORS)
				{
					System.out.println(name + " Wins!");
				}
				else if(cpuPick == Roshambo.PAPER)
				{
					System.out.println(player1 + " Wins!");
				}
			}
			
			else if(pick == Roshambo.SCISSORS)
			{
				if(cpuPick == Roshambo.PAPER)
				{
					System.out.println(name + " Wins!");
				}
				else if(cpuPick == Roshambo.ROCK)
				{
					System.out.println(player1 + " Wins!");
				}
			}
			answer = Validator.getAnswer(sc, "Would you like to play again?");
		}
		while(answer.equalsIgnoreCase("y"));

	}

	}


