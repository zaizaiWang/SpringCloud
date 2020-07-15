package com.wangsk.eurekaService.service.LoadClass;

public class Son extends Parent{
    static String str = "子类静态变量";
    String str1 = "子类成员变量";
    static{
        System.out.println(str+"----");
        System.out.println("子类静态代码块");

    }

    {
        System.out.println("子类静态非代码块");
    }

    public Son(){
        System.out.println(str1);
        System.out.println("子类构造方法");

    }
}
