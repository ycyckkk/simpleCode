package com.yc.create.factory.simple;

/**
 * @Author yucheng
 * @Date 2020/12/19 12:46
 */
public class SimpleFactory {
    public Product createProduct(String type) {
        if ("A".equals(type)) {
            return new ProductA();
        } else {
            return new ProductB();
        }
    }
}
