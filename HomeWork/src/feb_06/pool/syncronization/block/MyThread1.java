package feb_06.pool.syncronization.block;


public class MyThread1 extends Thread{

    SyncBlock t;

    MyThread1(SyncBlock t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printNumber(5);
    }
}
