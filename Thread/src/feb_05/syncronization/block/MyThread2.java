package feb_05.syncronization.block;
public class MyThread2 extends Thread{

    SyncBlock t;

    MyThread2(SyncBlock t) {
        this.t = t;
    }

    public void run() {
        t.printNumber(100);
    }
}
