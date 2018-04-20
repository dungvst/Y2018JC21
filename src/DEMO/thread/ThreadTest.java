package DEMO.thread;

import DEMO.common.CommonConstants;

public class ThreadTest {
    public static void main(String[] args) {

        // Test ThreadExtendDemo
       //Tạo ra luồng t1 từ class ThreadExtendDemo
        ThreadExtendDemo t1 = new ThreadExtendDemo();

        //Xét thứ tự ưu tiên cao nhất cho luồng này
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        //Tạo ra luồng t2 từ class ThreadExtendDemo
        ThreadExtendDemo t2 = new ThreadExtendDemo();
        t2.start();

        //Tạo ra luồng t3 từ class ThreadExtendDemo
        ThreadExtendDemo t3 = new ThreadExtendDemo();
        t3.start();


        // Test ThreadImplementDemo
       /* ThreadImplementDemo run4 = new ThreadImplementDemo();
        Thread t4 = new Thread(run4);
        t4.start();

        ThreadImplementDemo run5 = new ThreadImplementDemo();
        Thread t5 = new Thread(run5);
        t5.start();


        ThreadImplementDemo run6 = new ThreadImplementDemo();
        Thread t6 = new Thread(run6);
        t6.start();*/
    }
}
