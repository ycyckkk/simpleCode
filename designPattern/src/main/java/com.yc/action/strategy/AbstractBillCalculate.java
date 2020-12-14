package com.yc.action.strategy;

/**
 * @Author yucheng
 * @Date 2020/12/14 11:38
 */
public abstract class AbstractBillCalculate {

    BillService billService;

    public AbstractBillCalculate(BillService billService) {
        this.billService = billService;
    }

    abstract String calculate();
}
