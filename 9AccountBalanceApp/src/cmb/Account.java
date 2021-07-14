package cmb;
import cmb.CheckingAccount;
import cmb.Transactions;
import cmb.AccountApp;
/* * Author: Piano Hagens 
* This class should include an instance variable for the monthly fee and these methods:
void subtractMonthlyFee()
void setMonthlyFee(double monthlyFee)
double getMonthlyFee()
String getMonthlyFeeFormatted()
By default, the monthly fee for a checking account should be $1.
 * 03/05/2017 
 */
/*Create a class named Account that implements all three of these interfaces. In addition, 
 * it should supply a method like the following method that returns a balance that has been formatted as currency:
String getBalanceFormatted() //implements Depositable, Withdrawable, Balanceable*/


public abstract class Account implements Depositable, Withdrawable, Balanceable {
	//String getBalanceFormatted()
	
    double balance = 1000;
    double subtractMonthlyFee = 1;
    java.util.Currency Currency;
    Account()
    {
    }
    
    public void setbalance(double b)
    {
        balance = b;
    }
    public void setMonthlyFee(double monthlyFee)
    {
    	monthlyFee = 1;
    }
   
    public double getbalance()
    {
        return balance;
    }
    public double getMonthlyFee()
    {
        return getMonthlyFee();
    }
    public String getBalanceFormatted()
    {
        String output = "The date created " + Currency.toString();
        return output;
    }

    public void printInfo()
    {
        String output = "\nOrginal balance: " + balance + 
                "\nMonthly Fees: " + subtractMonthlyFee +
                
                "\nThe balance: " + getbalance() +
                "\n" + getBalanceFormatted();
        System.out.println(output);
       
    }
	
}
