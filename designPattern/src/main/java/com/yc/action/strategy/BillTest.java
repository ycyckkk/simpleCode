package com.yc.action.strategy;


/**
 * @Author yucheng
 * @Date 2020/12/14 11:42
 */
public class BillTest {
    public static void main(String[] args) {
        BillService billService1 = new BillAreaServiceImpl();
        BillService billService2 = new BillFixedServiceImpl();


        BillCalculate calculate1 = new BillCalculate(billService1);
        System.out.println(calculate1.calculate());

        calculate1 = new BillCalculate(billService2);
        System.out.println(calculate1.calculate());

    }
}
