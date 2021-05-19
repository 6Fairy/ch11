package edu.xcdq.demo01;

public class demo01 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("自己定义的线程名110");
        myThread1.start();  //线程调用
        // myThread1.run(); //普通调用


        MyThread t1 = new MyThread("线程1");
        MyThread t2 = new MyThread("线程2");
        MyThread t3 = new MyThread("线程3");
        MyThread t4 = new MyThread("线程4");
        MyThread t5 = new MyThread("线程5");
        MyThread t6 = new MyThread("线程6");
        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);
        t4.setPriority(4);
        t5.setPriority(5);
        t6.setPriority(6);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
