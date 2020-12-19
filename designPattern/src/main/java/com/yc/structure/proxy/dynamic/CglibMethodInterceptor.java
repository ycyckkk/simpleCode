package com.yc.structure.proxy.dynamic;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author yucheng
 * @Date 2020/12/14 18:19
 */
public class CglibMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib before");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib after");
        return obj;
    }
}
