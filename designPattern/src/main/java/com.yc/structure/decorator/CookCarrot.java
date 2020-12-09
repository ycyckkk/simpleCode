package com.yc.structure.decorator;

/**
 * @Author yucheng
 * @Date 2020/12/1 23:12
 */
public class CookCarrot implements CookVegetables {
    @Override
    public String cook() {
        return "cook Carrot";
    }
}
