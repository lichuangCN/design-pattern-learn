package site.muzhi.command.commands;

/**
 * Author: lichuang
 * Date: Create in 10:22 2019/12/4
 * Description: 空命令 什么也不做，用于初始化每个按钮
 */

public class NoCommand implements Command {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
