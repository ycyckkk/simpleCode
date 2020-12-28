package com.yc.action.iterator;

/**
 * @Author yucheng
 * @Date 2020/12/28 23:28
 */
public class IteratorTest {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
