package edu.xcdq.demo01;

public class MyThread extends Thread{
    public MyThread (String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println("自己创建的线程");
        System.out.println("线程名字"+Thread.currentThread().getName());
    }
}
  // 1 extends Thread
  // 2 覆写run 方法
  // 3 调用start 方法

