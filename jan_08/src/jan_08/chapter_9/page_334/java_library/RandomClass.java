package jan_08.chapter_9.page_334.java_library;

import java.util.Random;

public class RandomClass {

    public static void main(String[] args) {
        Random num1 = new Random();
        System.out.println("Random int number:");
        for (int i = 0; i < 10; i++) {
            System.out.println(num1.nextInt() + " ");
        }
        
        Random num2 = new Random();
        System.out.println("Random double number:");
        for (int i = 0; i < 10; i++) {
            System.out.println(num2.nextDouble() + " ");
        }
        
        Random num3 = new Random();
        System.out.println("Random boolean value:");
        for (int i = 0; i < 10; i++) {
            System.out.println(num2.nextBoolean() + " ");
        }
        
        Random num4 = new Random();
        System.out.println("Random float number:");
        for (int i = 0; i < 10; i++) {
            System.out.println(num2.nextFloat() + " ");
        }
        
        Random num5 = new Random();
        System.out.println("Random long number:");
        for (int i = 0; i < 10; i++) {
            System.out.println(num2.nextLong() + " ");
        }
    }
}