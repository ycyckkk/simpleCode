package com.yc.action.command;

/**
 * 关的命令
 * @Author yucheng
 * @Date 2020/12/29 21:20
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
