
package feb_05.ex_04;

public class Example_four implements Runnable {

    Thread t;

    Example_four(String str) {
        t = new Thread(this, str);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if ((i % 5) == 0) {
                System.out.println(Thread.currentThread().getName()
                        + " is yielding control...");
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName() + " has finished executing.");
    }
}
