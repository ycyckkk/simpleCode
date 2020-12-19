package com.yc.structure.adapter;

import java.util.Arrays;

/**
 * 大陆手机 <----大陆充电头
 * 港版手机 <----香港充电头
 *
 *
 * @Author yucheng
 * @Date 2020/12/1 20:19
 */
public class AdapterTest {
    public static void main(String[] args) {
        Arrays.asList();

        InlandAdapter inlandAdapter = new InlandPhone();
        HongkongAdapter hongkongAdapter = new HongkongPhone(inlandAdapter);
        System.out.println(hongkongAdapter.recharge());

    }
}
