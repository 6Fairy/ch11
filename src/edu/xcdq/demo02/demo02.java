package edu.xcdq.demo01.demo02;

public class demo02 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
    }

}
