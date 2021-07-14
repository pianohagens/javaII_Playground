import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InvoiceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		System.out.println("Welcome to Invoice Total Calculator\n");
		
		Scanner sc = new Scanner(System.in);
		
		//create a loop
		String choice = "y";
		while(!choice.equalsIgnoreCase("n")){
			//get user input
			System.out.println("Enter subtotal: \n");
			String subtotalLine = sc.nextLine();
			
			//
			double subtotal = new BigDecimal(subtotalLine).setScale(2, RoundingMode.HALF_UP)
					.doubleValue();
			
			//get discount percent based on the sub-total
			double discountPercent;
			if(subtotal >=200){
				discountPercent = .2;
				
			}else if(subtotal >=100){
				discountPercent = .1;				
			}else{
				discountPercent = 0;
			}			
			//calculate discount amount
			double discountAmount = subtotal * discountPercent;	
			discountAmount = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP)
					.doubleValue();
			
			//calculate the total before tax
			double totalBeforeTax = subtotal - discountAmount;
			
			//calculate the sales tax 
			final double SALES_TAX_PCT = .05;
			double salesTax = SALES_TAX_PCT * totalBeforeTax;
			salesTax = new BigDecimal(salesTax).setScale(2, RoundingMode.HALF_UP)
					.doubleValue();
			
			//calculate the total
			double total = totalBeforeTax + salesTax;
			
			//user the currency and percent formatter objects
			NumberFormat currency = NumberFormat.getCurrencyInstance();
			NumberFormat percent = NumberFormat.getPercentInstance();
			
			//disply the data
			String message = "\nInvoice\n" + 
			"Subtotal: " + currency.format(subtotal) + "\n" +
					"Discount Percent: " + currency.format(discountPercent) + "\n" +
					"Discount Amount: " + percent.format(discountAmount) + "\n" +
					"Total Before Tax: " + currency.format(totalBeforeTax) + "\n" +
					"Sales Tax: " + currency.format(salesTax) + "\n" +
					"Ivoice Total: " + currency.format(total) + "\n";
			
			System.out.println(message);
			System.out.println("Countine? y/n: ");
			choice = sc.nextLine();
			
		}
			sc.close();
			System.out.println("Bye");
		
		
	}

}
