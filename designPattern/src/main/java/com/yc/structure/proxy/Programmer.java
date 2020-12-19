package com.yc.structure.proxy;

import javax.sound.midi.Soundbank;

/**
 * @Author yucheng
 * @Date 2020/12/19 13:58
 */
public class Programmer implements HelloService{

    private HelloService helloService;

    public Programmer(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public void sayHello() {
        System.out.println("before sayHello");
        helloService.sayHello();
        System.out.println("after sayHello");
    }
}
