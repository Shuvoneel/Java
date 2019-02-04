package feb_04;

import java.util.logging.Level;
import java.util.logging.Logger;


public class CreateThread_01 extends Thread{
    
    
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum from thread 01: " + sum);
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(CreateThread_02.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
