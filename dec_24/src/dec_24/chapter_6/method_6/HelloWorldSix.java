package dec_24.chapter_6.method_6;

public class HelloWorldSix {

    public static void main(String[] args) {
        System.out.println(sayHello("Hello ", "World"));
        System.out.println(addNum(10, 20));
    }

    public static String sayHello(String msg1, String msg2) {
        String message = msg1 + msg2;
        return message;
    }

    public static int addNum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}