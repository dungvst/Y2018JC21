package DEMO.thread;

/**
 * Tạo thread bằng cách extend Thread
 */
public class ThreadExtendDemo extends Thread{
    // Nội dung

    @Override
    public void run() {
        System.out.println();
        for (int x = 1; x <= 3; x++) {
            System.out.println(x + " Thread name: " + Thread.currentThread().getName());
        }
    }
}
