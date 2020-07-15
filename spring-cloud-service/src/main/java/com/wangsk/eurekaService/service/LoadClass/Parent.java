package com.wangsk.eurekaService.service.LoadClass;

public class Parent {
    static String str = "父类静态变量";
     String str1 = "父类成员变量";
     static{
         System.out.println(str+"----");
         System.out.println("父类静态代码块");

         func();
     }
    {
        System.out.println("父类静态非代码块");
    }
     public static void func(){
         System.out.println("父类静态方法");
     }

     public Parent(){
         System.out.println(str1);
         System.out.println("父类构造方法");

     }
}
