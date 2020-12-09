package com.yc.action.strategy;

/**
 * 促销活动
 * @Author yucheng
 * @Date 2020/12/1 19:58
 */
public class DiscountContext {

    private DiscountStrategy discountStrategy;

    public DiscountContext(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public void promotion() {
        discountStrategy.discount();
    }
}
