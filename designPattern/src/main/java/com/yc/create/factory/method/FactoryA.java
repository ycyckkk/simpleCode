package com.yc.create.factory.method;

import com.yc.create.factory.simple.Product;
import com.yc.create.factory.simple.ProductA;

/**
 * @Author yucheng
 * @Date 2020/12/19 12:50
 */
public class FactoryA extends Factory {
    @Override
    public Product factoryMethod() {
        return new ProductA();
    }
}
