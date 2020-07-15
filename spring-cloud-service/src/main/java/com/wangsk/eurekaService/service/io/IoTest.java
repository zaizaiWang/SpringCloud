package com.wangsk.eurekaService.service.io;

import com.wangsk.eurekaService.service.DoubleWeipai.String;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IoTest {
    public static void main(String[] args) throws IOException {

        System.out.println("进入");
        String str = new String();
        System.out.println(str.getName());System.out.println("退出");

//        ObjectOutputStream objectOutputStream = new ObjectOutputStream();
//
//        objectOutputStream.write(new User("王仔仔",22));
//
//        ObjectInputStream objectInputStream = new ObjectInputStream(new File("d://"));
//        objectInputStream.w
    }
}
