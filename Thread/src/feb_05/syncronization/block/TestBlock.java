package feb_05.syncronization.block;

public class TestBlock {

    public static void main(String args[]) {
        SyncBlock obj = new SyncBlock();
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}
/**
 * Synchronized block can be used to perform synchronization on any specific
 * resource of the method.
 *
 * Suppose you have 50 lines of code in your method, but you want to synchronize
 * only 5 lines, you can use synchronized block.
 *
 * If you put all the codes of the method in the synchronized block, it will
 * work same as the synchronized method. Points to remember for Synchronized
 * block
 *
 * Synchronized block is used to lock an object for any shared resource. Scope
 * of synchronized block is smaller than the method.
 *
 */
