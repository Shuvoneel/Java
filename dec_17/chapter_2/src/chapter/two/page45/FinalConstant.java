package chapter.two.page45;

public class FinalConstant {
    static final double PI = 3.14159;
    double salary = 500.25;
    static final String MY_NAME = "Shuvo";

    public static void main(String[] args) {
        FinalConstant obj = new FinalConstant();
        obj.salary = 5000.25;
        System.out.println(PI + "," + obj.salary + "," + MY_NAME);
    }
}
