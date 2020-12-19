package com.yc.create.factory.method;

import com.yc.create.factory.simple.Product;

/**
 * 定义一个创建对象的抽象类，子类决定实例化的对象，将实例化步骤推给子类
 * java.util.Calendar
 * java.util.ResourceBundle
 * java.text.NumberFormat
 * java.nio.charset.Charset
 * java.net.URLStreamHandlerFactory
 * java.util.EnumSet
 * javax.xml.bind.JAXBContext
 *
 * @Author yucheng
 * @Date 2020/12/19 12:49
 */
public abstract class Factory {
    abstract public Product factoryMethod();
    public void doSomething() {
        Product product = factoryMethod();
        product.createProduct();
    }
}
