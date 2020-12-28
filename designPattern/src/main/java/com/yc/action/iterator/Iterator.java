package com.yc.action.iterator;

/**
 * @Author yucheng
 * @Date 2020/12/28 23:07
 */
public interface Iterator<Item> {
    boolean hasNext();

    Object next();
}
