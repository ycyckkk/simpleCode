package com.yc.action.strategy;

/**
 * @Author yucheng
 * @Date 2020/12/14 11:35
 */
public class BillAreaServiceImpl implements BillService {
    @Override
    public String getBill() {
        return "按照面积生成账单数据";
    }
}
