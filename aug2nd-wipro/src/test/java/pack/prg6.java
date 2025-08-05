package pack;

public class prg6 {
	String FirstName;
	String LastName;
	char gender;
	String a;
	
public prg6(String firstName, String lastName, char gender) {
		super();
		FirstName = firstName;
		LastName = lastName;
		this.gender = gender;
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
 
public char getGender() {
	return gender;
}
 
public void setGender(char gender) {
	this.gender = gender;
}

void display() {
	System.out.println("First Name: "+getFirstName());
	System.out.println("Last Name: "+getLastName());
	System.out.println("gender: "+getGender());
}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prg6 p=new prg6("Abhi", " Reddy",'M');
		
		p.display();
	}

	}






