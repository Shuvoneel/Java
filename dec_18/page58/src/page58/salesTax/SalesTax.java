package page58.salesTax;

import java.util.Scanner;

public class SalesTax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter purchase Amount: ");
        double amount = input.nextDouble();
        double tax = amount * 0.06;

        System.out.println("Your tax is: " + (tax * 100) / 100);
    }
}
