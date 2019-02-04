package feb_04;


public class Test extends CreateThread_02 {

    public static void main(String[] args) throws InterruptedException {

        CreateThread_01 a = new CreateThread_01();
        a.start();
        a.join(20000);

        Thread b = new Thread(new CreateThread_02());
        b.start();
        
    }
}
