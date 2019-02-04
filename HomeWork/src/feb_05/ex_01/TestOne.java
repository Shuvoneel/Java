package feb_05.ex_01;

public class TestOne {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Example_one());
        t1.setPriority(1);
        t1.setName("First Thread");
        System.out.println("t1 Pririty (set): " + t1.getPriority());
        System.out.println("t1 Name: " + t1.getName());

        t1.start();

        Thread t2 = new Thread(new Example_one());
        t2.setName("Second Thread");
        System.out.println("t2 Pririty (default): " + t2.getPriority());
        System.out.println("t2 Name: " + t2.getName());
        t2.start();

    }

}
