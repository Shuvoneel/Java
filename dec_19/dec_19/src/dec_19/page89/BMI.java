package dec_19.page89;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Weight in Pounds");
        double weight = input.nextDouble();

        System.out.println("Weight in Inches");
        double height = input.nextDouble();

        final double KG_PER_PBL = 0.45359237;

        final double METERS_PER_INCH = 0.0254;

        double wieghtInKgs = weight * KG_PER_PBL;
        double heightInMetrs = height * METERS_PER_INCH;
        double bmi = wieghtInKgs / (heightInMetrs * heightInMetrs);

        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("You're Underweight");
        } else if (bmi < 25) {
            System.out.println("You're Normal");
        } else if (bmi < 30) {
            System.out.println("You're Overweight");
        } else {
            System.out.println("You're Obese");
        }
    }
}
