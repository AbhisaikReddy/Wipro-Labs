package pack;

// User-defined exception
class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class prg3_1 {
    String FirstName;
    String LastName;
    char gender;

    // Constructor
    public prg3_1(String firstName, String lastName, char gender) throws InvalidNameException {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new InvalidNameException("First Name cannot be blank.");
        }
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new InvalidNameException("Last Name cannot be blank.");
        }
        this.FirstName = firstName;
        this.LastName = lastName;
        this.gender = gender;
    }

    // Getters and Setters
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

    // Display method
    void display() {
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Gender: " + getGender());
    }

    public static void main(String[] args) {
        try {
            prg3_1 p = new prg3_1("Abhi", "Reddy", 'M');
            p.display();


        } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
