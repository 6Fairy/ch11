package edu.xcdq.demo01.demo02;

public class MyThread implements Runnable{
    @Override
    public void run(){
        System.out.println("接口中覆写的run方法,是一个新线程");
        System.out.println("当前线程名字"+Thread.currentThread().getName());
    }

}
/*
* 1 implements Runnable
* 2 覆写run方法
* 3 把定义类对象加入到系统线程
* 4 调用start方法
* */
