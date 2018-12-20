package dec_20.page_91;

import java.util.Scanner;

public class TaxCount {

    public TaxCount() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Married Joint, Status = 1");
        System.out.println("Married Separate, Status = 2");
        System.out.println("Head od the Family, Status = 3");
        System.out.println("Enter your Status Number: ");

        int status = input.nextInt();

        double tax = 0;

        if (status == 1) {
            System.out.println("Enter your taxable Income:");
            double income = input.nextDouble();
            if (income <= 16700) {
                tax = income * .10;
            } else if (income <= 67900) {
                tax = 16700 * .10 + (income - 16700) * .15;
            } else if (income <= 137050) {
                tax = 16700 * .10 + (67900 - 16700) * .15 + (income - 67900) * .25;
            } else if (income <= 208850) {
                tax = 16700 * .10 + (67900 - 16700) * .15 + (137050 - 67900) * .25
                        + (income - 137050) * .28;
            } else if (income <= 372950) {
                tax = 16700 * .10 + (67900 - 16700) * .15 + (137050 - 67900) * .25
                        + (208850 - 137050) * .28 + (income - 208850) * .33;
            } else {
                tax = 16700 * .10 + (67900 - 16700) * .15 + (137050 - 67900) * .25
                        + (208850 - 137050) * .28 + (372950 - 208850) * .33 + (income - 372950) * .35;
            }
        } else if (status == 2) {
            System.out.println("Yet to be Calculated");
            System.exit(0);
        } else {
            System.out.println("Error: Invalid Status");
            System.exit(0);
        }
        System.out.println("Your tax is: " + (int) (tax * 100) / 100.0);
    }
}