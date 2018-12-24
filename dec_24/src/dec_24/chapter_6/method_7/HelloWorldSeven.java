package dec_24.chapter_6.method_7;

import dec_24.chapter_6.method_6.HelloWorldSix;

public class HelloWorldSeven {

    public static void main(String[] args) {
        System.out.println(sayHello());
        System.out.println(sayHello1());
    }

    public static String sayHello() {
        return HelloWorldSix.sayHello("Hello ", "World");
    }

    public static String sayHello1() {
        String msg = HelloWorldSix.sayHello("Hello ", "Shuvo");
        return msg;
    }
}
