package pack;

import java.time.LocalDate;

public class prg13 {
	
	public void cal(LocalDate purchaseDate, int warrantyYears, int warrantyMonths) {
        LocalDate expiryDate = purchaseDate.plusYears(warrantyYears).plusMonths(warrantyMonths);
        System.out.println("Purchase Date: " + purchaseDate);
        System.out.println("Warranty Period: " + warrantyYears + " years and " + warrantyMonths + " months");
        System.out.println("Warranty Expiry Date: " + expiryDate);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prg13 obj = new prg13();

        LocalDate purchaseDate = LocalDate.of(2022, 6, 10);
        int warrantyYears = 2;
        int warrantyMonths = 6;

        obj.cal(purchaseDate, warrantyYears, warrantyMonths);

	}

}
