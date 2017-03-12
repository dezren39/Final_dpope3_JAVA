package edu.cvtc.java;

public class Person {
	private String birthDate;
	private String firstName;
	private String lastName;
	
	public Person (String first, String last, String birth)
	{
		setFirst (first);
		setLast (last);
		setBirth (birth);
	}
	
	public Person (Person person)
	{
		setFirst (person.getFirst());
		setLast (person.getLast());
		setBirth (person.getBirth());
	}
	
	public Person () {}
	
	public String getBirth ()
	{
		return birthDate;
	}
	
	public void setBirth (String birth)
	{
		birthDate = birth;
	}	
	
	public String getFirst ()
	{
		return firstName;
	}
	
	public void setFirst (String first)
	{
		firstName = first;
	}
	
	public String getLast ()
	{
		return lastName;
	}
	
	public void setLast (String last)
	{
		lastName = last;
	}

	public String toString ()
	{
	    return "Person [firstName=" + getFirst () + 
	    		", lastName=" + getLast () +
	    		", birthDate=" + getBirth () + "]";
	}
}