package pack;

import java.util.Arrays;
import java.util.Scanner;

public class prg3_4 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); 

        String[] products = new String[numProducts];

        System.out.println("Enter product names:");
        for (int i = 0; i < numProducts; i++) {
            System.out.print("Product " + (i + 1) + ": ");
            products[i] = scanner.nextLine();
        }

        Arrays.sort(products);

        System.out.println("\nSorted product names:");
        for (String product : products) {
            System.out.println(product);
        }

        scanner.close();
    }
}