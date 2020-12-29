package com.yc.action.command;

/**
 * @Author yucheng
 * @Date 2020/12/29 21:48
 */
public class CommandTest {
    public static void main(String[] args) {

        Light light = new Light();

        Command onCommand = new LightOnCommand(light);
        Command offCommand = new LightOffCommand(light);

        Invoker invoker = new Invoker();
        invoker.setOnCommand(onCommand, 1);
        invoker.turnOnCommand(1);


        invoker.setOffCommand(offCommand, 1);
        invoker.turnOffCommand(1);


    }
}
