package feb_05.ex_02;

public class TestTwo {

    public static void main(String[] args) {
        Thread a = new Thread(new Example_two());
        a.setName("Mehedi");
        a.setPriority(1);

        Thread b = new Thread(new Shuvo());
        b.setName("Hasan");
        b.setPriority(7);
        
        System.out.println("aThread Name: " + a.getName());
        System.out.println("aThread Priority: " + a.getPriority());        
        System.out.println("bThread Name: " + b.getName());
        System.out.println("bThread Priority: " + b.getPriority());
        a.start();
        b.start();

    }

}
