package singleTon;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/**
 * 单例模式之饿汉
 * 特点：
 *      1、初始化一个静态的对象
 *      2、私有化构造器
 *      3、对外提供获取该静态对象的方法
 * 优点：
 *      1、类加载时就创建了，简单，无锁，执行效率高
 * 缺点：
 *      1、启动时就创建，造成初始化时资源浪费，耗时
 *      2、反射获取该类时线程不安全
 *      3、反序列化是线程不安全
 */
class User{
    private static User user = new User();
    private User(){

    }
    public static User getUser(){
        return user;
    }
}


public class singletonEh {

    @Test
    public void test(){
        User u1 = User.getUser();
        User u2 = User.getUser();
        System.out.println(u1);
        System.out.println(u2);
    }

    @Test
    public void fanshe() throws Exception{
        List<String> list = new ArrayList<String>();
        Class clazz = User.class;//获取类的模板
        Constructor constructor = clazz.getDeclaredConstructor();//获取类构造器
        constructor.setAccessible(true);//获取访问权限
        User u1 = User.getUser();
        User u2 = (User)constructor.newInstance();
        System.out.println(u1);
        System.out.println(u2);
    }
}
