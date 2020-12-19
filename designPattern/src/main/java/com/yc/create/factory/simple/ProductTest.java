package com.yc.create.factory.simple;

/**
 * @Author yucheng
 * @Date 2020/12/19 12:47
 */
public class ProductTest {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.createProduct("A").createProduct();
        simpleFactory.createProduct("B").createProduct();

    }
}
