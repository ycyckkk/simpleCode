package com.yc.structure.decorator;

/**
 * @Author yucheng
 * @Date 2020/12/1 23:15
 */
public class CookBeefMeat extends CookMeat {

    protected CookBeefMeat(CookVegetables cookVegetables) {
        super(cookVegetables);
    }

    @Override
    public String cookMeat() {
        return "cookMeat" + " " + cookVegetables.cook();
    }
}
