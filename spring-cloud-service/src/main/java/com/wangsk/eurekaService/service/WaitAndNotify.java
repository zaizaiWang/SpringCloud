package com.wangsk.eurekaService.service;

import java.util.concurrent.CountDownLatch;

public class WaitAndNotify {
    private static int size  = 0;

    public void add(){
        size++;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        WaitAndNotify waitAndNotify = new WaitAndNotify();

        final Object lock = new Object();
        CountDownLatch countDownLatch = new CountDownLatch(1);

        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
//                synchronized (lock){
                    for(int i=0;i<10;i++){
                        waitAndNotify.add();
                        System.out.println("当前线程："+Thread.currentThread().getName()+",size:"+waitAndNotify.getSize());
                        try {
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if(waitAndNotify.getSize()==5){
//                            lock.notify();
                            countDownLatch.countDown();
                            System.out.println("通知已发出");
                        }
                    }
                }

//            }
        },"t1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                synchronized (lock){
                    if(waitAndNotify.getSize()!=5){
                        try {
//                            lock.wait();
                            countDownLatch.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName()+"收到停止通知");
                    throw new RuntimeException();
                }
//            }
        },"t2");

        t2.start();
        t1.start();

    }
}
