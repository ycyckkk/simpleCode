package com.yc.action.strategy;

/**
 * @Author yucheng
 * @Date 2020/12/14 11:40
 */
public class BillCalculate extends AbstractBillCalculate {
    public BillCalculate(BillService billService) {
        super(billService);
    }

    @Override
    String calculate() {
        return billService.getBill();
    }
}
