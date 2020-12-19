package com.yc.action.responsibilitychain;

/**
 * @Author yucheng
 * @Date 2020/11/29 17:37
 */
public class DirectorHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        if (request.getAmount() > 1000) {
            return Boolean.FALSE;
        } else {
            return "Bob".equals(request.getName());
        }
    }
}
