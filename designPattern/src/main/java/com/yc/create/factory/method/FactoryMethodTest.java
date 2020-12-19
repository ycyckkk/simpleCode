package com.yc.create.factory.method;

/**
 * @Author yucheng
 * @Date 2020/12/19 12:51
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        factoryA.doSomething();

        Factory factoryB = new FactoryB();
        factoryB.doSomething();
    }
}
