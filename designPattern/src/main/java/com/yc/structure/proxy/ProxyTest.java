package com.yc.structure.proxy;

/**
 * 对原来的类进行一个增作用
 *
 * @Author yucheng
 * @Date 2020/12/1 20:41
 */
public class ProxyTest {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        HelloService helloServiceProxy = new Programmer(helloService);
        helloServiceProxy.sayHello();
    }
}
