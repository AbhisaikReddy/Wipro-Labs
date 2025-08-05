package pack;

import java.util.Scanner;

public class prg8 {
	String FirstName;
	String LastName;
	enum gender{M,F};
	String a;
	
public prg8(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
 
public String getFirstName() {
	return FirstName;
}
 
public void setFirstName(String firstName) {
	FirstName = firstName;
}
 
public String getLastName() {
	return LastName;
}
 
public void setLastName(String lastName) {
	LastName = lastName;
}
 
void number() {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	a=s.next();
}
public String getA() {
	return a;
}
 
public void setA(String num) {
	a = num;}

void display() {
	System.out.println("First Name: "+getFirstName());
	System.out.println("Last Name: "+getLastName());
	System.out.println("gender: "+prg8.gender.M);
	System.out.println("Phone Number: "+getA());
}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prg8 p=new prg8("Abhi", " Reddy");
		p.number();
		p.display();

	}

}

