package com.wangsk.eurekaService.service;

public class Exchange {

    public static void  tempFunc(Integer a,Integer b){
        a = a+b;
        System.out.println(a.hashCode());
    }

    public static void  strFunc(String a){
        System.out.println("操作前:"+a.hashCode());
        a = "sdsd";
        System.out.println("操作后:"+a.hashCode());
    }

    public static void  arrFunc(char[] a){
        System.out.println("操作前:"+a.hashCode());
        a[0]=1;
        System.out.println("操作后:"+a.hashCode());
    }

    public static void main(String[] args) {

//        Integer a = new Integer(10);
//
//        Integer b = new Integer(10);

//        String a = new String ("王善考");
//
          String a = "王善考";

//        char[] a = new char[]{1,2,3,4};
        System.out.println("传值前:"+a.hashCode());
        strFunc(a);
        System.out.println("传值前:"+a.hashCode());
    }

}
