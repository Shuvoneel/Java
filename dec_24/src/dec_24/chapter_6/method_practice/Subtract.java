package dec_24.chapter_6.method_practice;

import loop.While_Loop;

public class Subtract {

    public static void main(String[] args) {
        System.out.println(subNum(110, 10));
        System.out.println("Sum from Library:" + While_Loop.printSum(1, 10));
    }

    public static int subNum(int a1, int a2) {
        int result = a1 - a2;
        return result;
    }
}
