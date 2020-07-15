package com.wangsk.eurekaService.service.io;

public class User {

    String name;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
