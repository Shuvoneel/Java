package feb_03;

public class ThreadDemo {

    public static void main(String[] args) {
        Runnable printA = new PrintChar('a', 100);
        Runnable printB = new PrintChar('b', 100);
        Runnable print100 = new PrintNum(100);

        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        thread1.start();
        thread2.start();
        thread3.start();
        
        
        System.out.println(thread1.isAlive());
        System.out.println(thread2.isAlive());
        System.out.println(thread3.isAlive());
    }

}
