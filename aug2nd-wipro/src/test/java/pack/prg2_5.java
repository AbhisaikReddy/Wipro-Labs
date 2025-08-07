package pack;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

abstract class Account {
	private long accNum;
	private double balance = 500;
	private Person accHolder;

	public Account(long accNum, double balance, Person person) {
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = person;
	}

	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}


	public abstract boolean withdraw(double amount);

	@Override
	public String toString() {
		return "Account Number: " + accNum +
		       "\nBalance: " + balance +
		       "\nAccount Holder: " + accHolder.getName();
	}


	protected void reduceBalance(double amount) {
		balance -= amount;
	}
}


class SavingsAccount extends Account {
	public SavingsAccount(long accNum, double balance, Person person) {
		super(accNum, balance, person);
	}

	@Override
	public boolean withdraw(double amount) {
	    if (amount <= (getBalance() - 500)) {
	        setBalance(getBalance() - amount);
	        return true;
	    }
	    return false;
	}

}
public class prg2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Smith", 23);
		Person p2 = new Person("Kathy", 22);

		Account a1 = new SavingsAccount(1001, 2000, p1);
		Account a2 = new SavingsAccount(1002, 3000, p2);

		a1.setBalance(2000);
		a2.withdraw(2000);

		System.out.println(a1.getAccNum() + " Account has Balance : " + a1.getBalance());
		System.out.println(a2.getAccNum() + " Account has Balance : " + a2.getBalance());
		System.out.println(a1);
		System.out.println(a2);

	}

}
