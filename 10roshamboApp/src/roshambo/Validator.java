package roshambo;

import java.util.Scanner;

public class Validator {

	public static String getAnswer(Scanner sc, String prompt) {
		String answer = "";
		System.out.println(prompt);
		while (true) {
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n"))
				return answer;
			else
				System.out.println("Error:  Please enter y or n");
		}

	}
	//only take l or b
	public static String getTeam(Scanner sc, String prompt) {
		String answer = "";
		System.out.println(prompt);
		while (true) {
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("b") || answer.equalsIgnoreCase("l"))
				return answer;
			else
				System.out.println("Error:  Please enter l or b");
		}

	}
	
	public static String getString(Scanner sc, String prompt) {
		System.out.println(prompt);
		String s = sc.next();
		sc.nextLine();
		return s;
	}
	//only take r, p, or s
	public static String getSelection(Scanner sc, String prompt) {
		String answer = "";
		System.out.println(prompt);
		while (true) {
			answer = sc.nextLine();
			if (answer.equalsIgnoreCase("r") || answer.equalsIgnoreCase("p") || answer.equalsIgnoreCase("s"))
				return answer;
			else
				System.out.println("Error:  Please enter r, p, or s");
		}

	}
	
	
}
