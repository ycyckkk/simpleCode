package com.yc.create.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        System.out.println(Singleton1.getInstance() == Singleton1.getInstance());
    }
}
