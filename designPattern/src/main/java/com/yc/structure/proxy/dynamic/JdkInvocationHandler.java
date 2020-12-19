package com.yc.structure.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author yucheng
 * @Date 2020/12/14 18:03
 */
public class JdkInvocationHandler implements InvocationHandler {


    UserService userService;

    public JdkInvocationHandler(UserService userService) {
        this.userService = userService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk before");
        Object object = method.invoke(userService, args);
        System.out.println("jdk after");
        return object;
    }
}
