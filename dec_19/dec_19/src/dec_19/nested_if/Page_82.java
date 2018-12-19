package dec_19.nested_if;

import java.util.Scanner;

public class Page_82 {

    static int i;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        if (i >= 90) {
            System.out.println("Grade is A");
        } else if (i >= 80) {
            System.out.println("Grade is B");
        } else if (i >= 70) {
            System.out.println("Grade is C");
        } else if (i >= 60) {
            System.out.println("Grade is D");
        } else if (i >= 50) {
            System.out.println("Grade is E");
        } else {
            System.out.println("Grade is F");
        }
    }
}
