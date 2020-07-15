package com.wangsk.eurekaService.service.TreadTest;

import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Executor executorService =
//        Executors.newSingleThreadExecutor();
                Executors.newCachedThreadPool();
//        Executors.newFixedThreadPool(10);

        Semaphore semaphore = new Semaphore(10);

        for(int i=0;i<100;i++){
            semaphore.acquire();
            ExecutorBean executorBean = new ExecutorBean(""+i);
            executorService.execute(executorBean);
            semaphore.release();
        }


//        for(int i=0;i<100;i++){
//            semaphore.acquire();
//            CallableBean callableBean = new CallableBean(""+i);
//            Future<String> future = ((ExecutorService) executorService).submit(callableBean);
//            System.out.println(future.get());
//            semaphore.release();
//        }
            ((ExecutorService) executorService).shutdown();
    }

    public static void semPhoneTest(){
        Semaphore semaphore = new Semaphore(1);
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程"+Thread.currentThread().getName()+"获得了信号量，执行消耗了1s");
                semaphore.release();
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                try {
                    semaphore.acquire();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程"+Thread.currentThread().getName()+"获得了信号量，执行消耗了1s");
                semaphore.release();
            }
        };
    }
}
