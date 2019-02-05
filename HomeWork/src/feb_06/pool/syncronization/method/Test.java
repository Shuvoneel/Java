package feb_06.pool.syncronization.method;

public class Test {

    public static void main(String args[]) {
        final SyncClass obj = new SyncClass();

        Thread t1 = new Thread() {
            public void run() {
                obj.printNumber(5);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                obj.printNumber(10);
            }
        };

        t2.start();
        t1.start();
    }
}
