package cmb;
import cmb.Account;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/* * Author: Piano Hagens 
 * 03/05/2017 
 */
/*Create a class named Transactions that contains the following static methods for 
 * depositing and withdrawing funds from either type of account:
public static void deposit(Depositable account, double amount) {
    account.deposit(amount);
}
        deposit = d;
        balance += d;
        
        if(d > 10000)
        {
            System.out.println("Can't deposit a value greater than 10000 per transaction" );
            System.exit(0);
        }

*/
public class Transactions extends Account
{double amount;
    double deposit = 0;
    double d;
    Transactions()//double w
    {
        //super(s);
        //deposit = s;
        //setdeposit(s);
    }
    
    public static void deposit(Depositable account, double amount) {
        account.deposit(amount);

    }
    public void setDeposit(double amount)
    {
    	 deposit = amount;
         balance += amount;
         
         if(amount > 10000)
         {
             System.out.println("Can't deposit a value greater than 10000 per transaction" );
             System.exit(0);
         }
    }
     
    
    public double getdeposit()
    {
        return deposit;
    }
    
    public void print()
    {
    	System.out.println("Deposited " + amount +
                "\nFinal Balance: " + balance);
    }
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void setBalance(double amount) {
		// TODO Auto-generated method stub
		
	}
}
