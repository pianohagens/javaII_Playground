package cmb;
import cmb.Account;;
/* * Author: Piano Hagens 
 * 03/05/2017 
 */
/*Create a class named CheckingAccount that inherits the Account class. 
 * 
*/
public class CheckingAccount extends Account{
	double amount;
	 double withDraw = 0;
	 double w;
	 
	 CheckingAccount()//double c
	    {
	        //super(a);
	        //withDraw = w;
	        //setwithDraw(w);
	    }
	 
	 public static void withdraw(Withdrawable account, double amount) {
		    account.withdraw(amount);
		    
		}
	 
	    public void setwithDraw(double amount)
	    {
	       	   withDraw = amount;
	            balance -= amount;
	            
	            if(amount > balance)
	            {
	                System.out.println("Can't Withdraw a value greater your balance" );
	                System.exit(0);
	            }
	    }
	    public double getwithDraw()
	    {
	        return withDraw;
	    }
	     public void print()
	     {
	    	 System.out.println("Withdrawed " + amount +
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
