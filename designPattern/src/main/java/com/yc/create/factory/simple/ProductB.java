package com.yc.create.factory.simple;

/**
 * @Author yucheng
 * @Date 2020/12/19 12:45
 */
public class ProductB implements Product {
    @Override
    public void createProduct() {
        System.out.println("create ProductB");
    }
}
