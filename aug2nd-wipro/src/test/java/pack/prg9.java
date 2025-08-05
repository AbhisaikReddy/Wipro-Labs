package pack;

import java.util.Scanner;

public class prg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the choice");
		int choice=s.nextInt();
		String s1="abhi";
	
		
		switch (choice) {
        case 1:
            
           System.out.println(s1+s1);
           break;
        case 2:
            StringBuilder replaced = new StringBuilder(s1);
            for (int i = 0; i < s1.length(); i++) {
                if (i % 2 != 0) {
                    replaced.setCharAt(i, '#');
                }
            }
            System.out.println(replaced.toString());
            break;
        case 3:
            StringBuilder Dup = new StringBuilder();
            for (int i = 0; i < s1.length(); i++) {
                char c = s1.charAt(i);
                if (Dup.indexOf(String.valueOf(c)) == -1) {
                    Dup.append(c);
                }
            }
            System.out.println(Dup.toString());
            break;
        case 4:
            StringBuilder Upper = new StringBuilder();
            for (int i = 0; i < s1.length(); i++) {
                char c = s1.charAt(i);
                if (i % 2 != 0) {
                    Upper.append(Character.toUpperCase(c));
                } else {
                    Upper.append(c);
                }
            }
            System.out.println(Upper.toString());
            break;
        default:
           System.out.println("Invalid choice!");

	}


	}

}

