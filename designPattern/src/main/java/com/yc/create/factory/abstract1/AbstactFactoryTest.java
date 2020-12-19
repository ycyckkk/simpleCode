package com.yc.create.factory.abstract1;

/**
 * @Author yucheng
 * @Date 2020/12/19 13:33
 */
public class AbstactFactoryTest {
    public static void main(String[] args) {
        AbstactFactory factory = new Factory1();
        System.out.println(factory.createProductA().getClass().getName());
        System.out.println(factory.createProductB().getClass().getName());
    }
}
