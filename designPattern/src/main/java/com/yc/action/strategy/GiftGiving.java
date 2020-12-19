package com.yc.action.strategy;

/**
 * 购满2000送赠品
 * @Author yucheng
 * @Date 2020/12/1 19:55
 */
public class GiftGiving implements DiscountStrategy {
    @Override
    public void discount() {
        System.out.println("购满2000送赠品");
    }
}
