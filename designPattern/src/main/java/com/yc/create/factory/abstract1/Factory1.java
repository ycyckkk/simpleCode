package com.yc.create.factory.abstract1;

/**
 * @Author yucheng
 * @Date 2020/12/19 13:32
 */
public class Factory1 extends AbstactFactory {
    @Override
    public AbstactProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstactProductB createProductB() {
        return new ProductB1();
    }
}
