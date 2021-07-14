package rc;
public class RecCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Rectangle Calculator\n");	
		
	//initialize variable for width and length in data type of double
		double width = 4.25;
		double length = 8.5;
		
		//calculate the area and the perimeter of the rectangle
		double perimeter = width * 2 + length * 2;
		double area = width * length;
		
		//store the output in a string
		String result = 
				"Width:     " + width + "\n" + 
				"Length:    " + length + "\n" + 
				"Perimeter: " + perimeter + "\n" + 
				"Area:      " + area; 						
		
		//print the output to the console
		System.out.println(result);
		
	}
}
