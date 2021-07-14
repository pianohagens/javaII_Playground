package rc;

import java.util.Scanner;
public class RecCalculator {
	/**
	* @param args
	*/		
	public static void main(String[] args) {
		System.out.println("Welcome to Rectangle Calculator\n");
		
		//instantiate a Scanner object
		Scanner sc = new Scanner(System.in);
		
		//Collect information of the Rectangle		
		System.out.println("Collect the width of the Rectangle");
		String width = sc.nextLine();
		
		System.out.println("Collect the length of the Rectangle");
		String length = sc.nextLine();
				
		//close Scanner object
		sc.close();		
	}
}
