package com.yc.structure.adapter;

/**
 * @Author yucheng
 * @Date 2020/12/1 22:57
 */
public class HongkongPhone implements HongkongAdapter {

    public InlandAdapter inlandAdapter;

    public HongkongPhone(InlandAdapter inlandAdapter) {
        this.inlandAdapter = inlandAdapter;
    }

    @Override
    public String recharge() {
        return "转化："+ inlandAdapter.recharge();
    }
}
