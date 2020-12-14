package com.yc.structure.proxy.dynamic;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author yucheng
 * @Date 2020/12/14 18:09
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        InvocationHandler invocationHandler = new JdkInvocationHandler(userService);//实现invocationHandler接口
        UserService jdkProxyService = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(), invocationHandler);//生成代理类
        jdkProxyService.getUser();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(new CglibMethodInterceptor());//实现MethodInterceptor
        UserService cglibProxyService = (UserService) enhancer.create();//生成的代理类是父类
        cglibProxyService.getUser();
    }
}
