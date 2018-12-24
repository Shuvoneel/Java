package dec_24.chapter_6.method_11;

public class HelloWorldEleven {

    public static void main(String[] args) {
        System.out.println(sayHi(18, 29));
    }

    public static String sayHi(int n1, int n2) {
        String msg = String.valueOf(n1) + String.valueOf(n2);
        return msg;
    }
}