package com.yc.structure.proxy;

/**
 * @Author yucheng
 * @Date 2020/12/19 13:57
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("origin say hello");
    }
}
