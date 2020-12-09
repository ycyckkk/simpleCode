package com.yc.action.strategy;

/**
 * 购买3000送购物卡
 * @Author yucheng
 * @Date 2020/12/1 19:56
 */
public class ShoppingCard implements DiscountStrategy{
    @Override
    public void discount() {
        System.out.println("购买3000送购物卡");
    }
}
