package jan_08.chapter_9.page_342;

public class Modifier {

    private int privateVar = 5000;
    int defaultVar = 1000;
    protected int protectedVar = 500;
    public int publicVar = 100;

    public static void main(String[] args) {
        Modifier var1 = new Modifier();
        System.out.println(var1.privateVar);
        System.out.println(var1.defaultVar);
        System.out.println(var1.protectedVar);
        System.out.println(var1.publicVar);
    }
}
