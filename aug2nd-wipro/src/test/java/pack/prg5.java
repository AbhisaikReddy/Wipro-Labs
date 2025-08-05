package pack;

import java.util.Scanner;

public class prg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the phone Number :");
		int a=s.nextInt();
		if(a>0) {
			System.out.println("The entered number is positive");
		}
		else {
			System.out.println("The entered number is negative ");
		}


	}

}
