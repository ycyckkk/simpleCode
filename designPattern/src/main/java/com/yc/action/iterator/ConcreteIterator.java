package com.yc.action.iterator;

/**
 * @Author yucheng
 * @Date 2020/12/28 23:07
 */
public class ConcreteIterator<Item> implements Iterator {

    //    public ConcreteAggregate objects;
    private int position;
    private Item[] items;


    public ConcreteIterator(Item[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }

    @Override
    public Object next() {
        return items[position++];
    }
}
