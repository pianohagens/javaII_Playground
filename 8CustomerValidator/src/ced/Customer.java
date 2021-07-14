package ced;


/**
Create a class named Customer that inherits the Person class. This class should store a customer number, 
it should provide get and set methods for the customer number, it should provide a no-argument constructor,
 and it should provide an implementation of the getDisplayText method. 
 The getDisplayText method should return a string that consists of the string returned by the 
 toString method of the Person class appended with the Customer number like this:
You entered:
Name: Dave Gahan
Email: dave12@gmail.com
Customer number: M10293
 */

public class Customer extends Person {
	
	private String custNo = null;
	
	public Customer() {

	}
	
	String getCustNo() {
		return custNo;
	}
	void setCustNo(String cn) {
		custNo = cn;
	}
	
	public String getDisplayText() {
		return super.toString() + "\nCustomer Number: " + custNo + "\n";
	}
}
 

 


