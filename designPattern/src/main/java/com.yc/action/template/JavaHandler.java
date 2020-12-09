package com.yc.action.template;

/**
 * @Author yucheng
 * @Date 2020/12/1 19:04
 */
public class JavaHandler extends Handler {
    @Override
    public void doWorkBefore() {
        System.out.println("打开idea，谷歌浏览器.....");
    }

    @Override
    public void doWorkAfter() {
        System.out.println("关闭idea，关闭浏览器....");
    }
}
