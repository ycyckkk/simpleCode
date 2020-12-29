package com.yc.action.command;

/**
 * 开的命令
 * @Author yucheng
 * @Date 2020/12/29 21:20
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
