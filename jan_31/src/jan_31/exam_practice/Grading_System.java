package jan_31.exam_practice;

import java.util.Scanner;

public class Grading_System {

    public static void main(String[] args) {
        gradeCount();
    }

    public static void gradeCount() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your obtained number");
        int n = input.nextInt();

        switch ((n / 10) * 10) {
            case 90:
                System.out.println("Grade A+");
                break;
            case 80:
                System.out.println("Grade A");
                break;
            case 70:
                System.out.println("Grade B");
                break;
            case 60:
                System.out.println("Grade C");
                break;
            default:
                System.out.println("Failed");
        }
    }
}
