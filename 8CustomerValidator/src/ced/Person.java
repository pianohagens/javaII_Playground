package ced;
public abstract class Person {
/**
Create an abstract Person class that stores first name, last name, and email address.
This class should provide a no-argument constructor, get and set methods for each instance variable, 
and it should override the toString method so it returns the first name, 
last name, and email fields in this format:
Name: Dave Gahan
Email: dave12@gmail.com
	In addition, it should contain an abstract method named getDisplayText that returns a string.
	**/

	private String firstName = null;
	private String lastName = null;
	private String email = null;
	
	public abstract String getDisplayText();
	
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\nEmail: " + email;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fn) {
		firstName = fn;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String ln) {
		lastName = ln;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String em) {
		email = em;
	}
}
