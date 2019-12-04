package site.muzhi.command;

import site.muzhi.command.commands.Command;
import site.muzhi.command.commands.NoCommand;

/**
 * Author: lichuang
 * Date: Create in 10:19 2019/12/4
 * Description:
 */

public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;

    // 记住最近的一次命令,用于撤销操作
    private Command undoCommand;

    public RemoteController() {
        // 添加命令
        onCommands = new Command[2];
        offCommands = new Command[2];
        // 初始化命令
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 根据按钮位置,设置命令
     *
     * @param num
     * @param onCommand
     * @param offCommand
     */
    public void setOnCommands(int num, Command onCommand, Command offCommand) {
        onCommands[num] = onCommand;
        offCommands[num] = offCommand;
    }

    /**
     * 按下开按钮
     *
     * @param num
     */
    public void onButtonWasPushed(int num) {
        // 执行按下开的按钮
        onCommands[num].execute();
        // 记录这次的操作
        undoCommand = onCommands[num];
    }

    /**
     * 按下关按钮
     *
     * @param num
     */
    public void offButtonWasPushed(int num) {
        // 执行按下开的按钮
        offCommands[num].execute();
        // 记录这次的操作
        undoCommand = offCommands[num];
    }

    /**
     * 按下撤销按钮
     */
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
}
