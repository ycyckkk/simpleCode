package com.yc.action.template;

/**
 * @Author yucheng
 * @Date 2020/12/1 19:01
 */
public abstract class Handler {

    public final String doWork() {
        doWorkBefore();
        System.out.println("do work");
        doWorkAfter();
        return "ready go";
    }

    public abstract void doWorkBefore();

    public abstract void doWorkAfter();

}
