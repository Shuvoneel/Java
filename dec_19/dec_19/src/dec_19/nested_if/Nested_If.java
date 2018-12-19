package dec_19.nested_if;

import java.util.Scanner;

public class Nested_If {

    static int i;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        i = input.nextInt();
        if (i < 20) {
            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    System.out.println("I'm third IF");
                }
            } else {
                System.out.println("I'm second IF");
            }
        } else {
            System.out.println("I'm first IF");
        }
    }
}
