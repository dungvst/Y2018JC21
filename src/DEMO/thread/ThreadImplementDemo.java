package DEMO.thread;

/**
 * Tạo thread bằng cách implements Runnable
 */
public class ThreadImplementDemo extends ParentClass implements Runnable {
    @Override
    public void run() {
        System.out.println();
        for (int x = 1; x <= 3; x++) {
            System.out.println(x + " Thread name: " + Thread.currentThread().getName());
        }
    }
}
