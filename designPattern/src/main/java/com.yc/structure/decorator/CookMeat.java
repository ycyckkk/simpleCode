package com.yc.structure.decorator;

/**
 * @Author yucheng
 * @Date 2020/12/1 23:14
 */
public abstract class CookMeat {

    protected volatile CookVegetables cookVegetables;

    protected CookMeat(CookVegetables cookVegetables) {
        this.cookVegetables = cookVegetables;
    }

    public abstract String cookMeat();
}
