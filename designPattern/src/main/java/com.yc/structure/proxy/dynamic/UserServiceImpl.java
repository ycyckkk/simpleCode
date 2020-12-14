package com.yc.structure.proxy.dynamic;

/**
 * @Author yucheng
 * @Date 2020/12/14 18:04
 */
public class UserServiceImpl implements UserService {
    @Override
    public void getUser() {
        System.out.println("getUser");
    }
}
