package com.wangsk.eurekaService.service.LoadClass;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class test {
    public static void main(String[] args) {
//        Son son = new Son();
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(8765);
            Socket socket = serverSocket.accept();
            System.out.println(socket.getOutputStream());
        }catch (Exception e){
            System.out.println(e);
        }finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static void ioTest(){
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2,10,2, TimeUnit.MICROSECONDS, queue,);
        ExecutorService executorService =  Executors.newFixedThreadPool(10);
        ExecutorService executorService1 = Executors.newCachedThreadPool();
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
    }
}
