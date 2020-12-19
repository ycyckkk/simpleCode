package com.yc.action.responsibilitychain;

/**
 * @Author yucheng
 * @Date 2020/11/29 17:23
 */
public class CEOHandler implements Handler {

    @Override
    public Boolean process(Request request) {
        if (request.getName().endsWith("Paul")) {
            return Boolean.TRUE;
        } else {
            return null;
        }
    }
}
