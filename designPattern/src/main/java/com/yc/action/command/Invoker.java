package com.yc.action.command;

/**
 * 遥控器
 * @Author yucheng
 * @Date 2020/12/29 21:34
 */
public class Invoker {
    Command[] onCommands;
    Command[] offCommands;

    int slotNum = 7;

    public Invoker() {
        this.onCommands = new Command[slotNum];
        this.offCommands = new Command[slotNum];
    }

    public void setOnCommand(Command command, int slot) {
        onCommands[slot] = command;
    }

    public void setOffCommand(Command command, int slot) {
        offCommands[slot] = command;

    }

    //执行命令
    public void turnOnCommand(int slot) {
        onCommands[slot].execute();
    }

    public void turnOffCommand(int slot) {
        offCommands[slot].execute();

    }
}
