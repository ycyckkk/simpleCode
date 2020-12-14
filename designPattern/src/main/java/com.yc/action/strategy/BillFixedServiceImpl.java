package com.yc.action.strategy;

/**
 * @Author yucheng
 * @Date 2020/12/14 11:33
 */
public class BillFixedServiceImpl implements BillService {
    @Override
    public String getBill() {
        return "按照固定金额生成账单数据";
    }
}
