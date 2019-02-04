package feb_05.ex_05;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Example_five extends Thread {

    int i = 0;

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Example_five.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Thread started running..");
        while (true) {
            System.out.println("Result of i: " + i++);
            if (i == 10) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        Thread a = new Example_five();
        a.start();
        Thread b = new Thread();
        b.start();
        System.out.println("Name: "+b.getName());
    }
}
