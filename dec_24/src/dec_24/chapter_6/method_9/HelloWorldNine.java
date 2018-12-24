package dec_24.chapter_6.method_9;

import dec_24.chapter_6.method_6.HelloWorldSix;

public class HelloWorldNine {

    public static void main(String[] args) {
        sayHello();
        System.out.println(sayHello("Shuvo"));
        System.out.println(sayHello("Mehedi ", "Hasan"));
        System.out.println(sayHello("Shuvo ", 29));
        System.out.println(sayHello(29, " Shuvo"));
    }

    public static void sayHello() {
        System.out.println("Hello World................!!!!");
    }

    public static String sayHello(String s1) {
        return s1;
    }

    public static String sayHello(String s1, String s2) {
        return s1 + s2;
    }

    public static String sayHello(String s1, int n1) {
        return s1 + n1;
    }

    public static String sayHello(int n2, String s2) {
        return n2 + s2;
    }
}
