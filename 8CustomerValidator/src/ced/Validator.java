package ced;

import java.util.Scanner;


public class Validator {

	public static String getYorN(Scanner sc, String prompt)
	{
		String answer = "";
		boolean isValid = false;
		while (isValid == false)
		{
			System.out.print(prompt);
			answer = sc.next();
			if (answer.equals("y") || answer.equals("Y") || answer.equals("n") || answer.equals("N"))
			{
				isValid = true;
			}
			else
			{
				System.out.println("Error! Please enter y or n. Try again.");
			}
		}
		return answer;
	}
	
	public static String getCorE(Scanner sc, String prompt)
	{
		String answer = "";
		boolean isValid = false;
		while (isValid == false)
		{
			System.out.print(prompt);
			answer = sc.next();
			if (answer.equals("c") || answer.equals("C") || answer.equals("e") || answer.equals("E"))
			{
				isValid = true;
			}
			else
			{
				System.out.println("Error! Please enter c or e. Try again.");
			}
		}
		return answer;
	}
	
	public static String getSSno(Scanner sc, String prompt)
	{
		String answer = null;
		boolean isValid = false;
		while (isValid == false)
		{
			System.out.print(prompt);
			answer = sc.next();
			if (answer.matches("[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9][0-9][0-9]"))
			{
				isValid = true;
			}
			else
			{
				System.out.println("Error! Please enter valid social security no: nnn-nn-nnnn, such as 111-11-1111");	
			}
		}
		return answer;
	}
	
	public static String getEmailAdd(Scanner sc, String prompt)
	{
		String answer = null;
		boolean isValid = false;
		while (isValid == false)
		{
			System.out.print(prompt);
			answer = sc.next();
			if (answer.matches("[a-zA-Z_0-9]+@[a-zA-Z_0-9]+\\.[a-zA-Z_0-9]+"))
			{
				isValid = true;
			}
			else
			{
				System.out.println("Error! Please enter valid email address *@*.*, such as jack@yahoo.com");	
			}
		}
		return answer;
	}
}
