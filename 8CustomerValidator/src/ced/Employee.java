package ced;


/**
Create a class named Employee that inherits the Person class. This class should store 
a social security number, it should provide get and set methods for the social security number, 
it should provide a no-argument constructor, and it should provide an implementation 
of the getDisplayText method. The getDisplayText method should return a string that 
consists of the string returned by the toString method of the Person class appended 
with the Employees social security number like this:
Name: Martin Gore
Email: martin34@gmail.com
Social security number: 111-11-1111
 */

public class Employee extends Person {
	private String ssNo = null;
		
	public Employee() {
	}
		
	String getSSNo() {
		return ssNo;
	}
	void setSSNo(String ssn) {
		ssNo = ssn;
	}
		
	public String getDisplayText() {
		return super.toString() + "\nSocial Security Number: " + ssNo + "\n";
	}
}


