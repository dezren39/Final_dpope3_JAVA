package edu.cvtc.java;

public class Contact extends Person
{
	private String emailAddress;
	private String phoneNumber;
	
	public Contact (Contact contact)
	{
		super (contact);
		
		setEmail (contact.getEmail());
		setPhone (contact.getPhone());
	}
	
	public Contact (String email, String phone, String first, String last, String birth)
	{
		super (first, last, birth);
		
		setEmail (email);
		setPhone (phone);
	}
	
	public Contact (String email, String phone, Person person) 
	{
		super (person);
		
		setEmail (email);
		setPhone (phone);
	}
	
	public Contact (String email, String phone)
	{
		setEmail (email);
		setPhone (phone);
	}
	
	public Contact (Person person)
	{
		super (person);
	}
	
	public Contact () {}
	
	public String getEmail ()
	{
		return emailAddress;
	}
	
	public void setEmail (String email)
	{
		emailAddress = email;
	}
	
	public String getPhone()
	{
		return phoneNumber;
	}
	
	public void setPhone (String phone)
	{
		phoneNumber = phone;
	}	
	
	public String toString ()
	{
	    return "Contact [emailAddress=" + getEmail () + 
	    		", phoneNumber=" + getPhone () +
	    		" " + super.toString () + "]";
	}
}
