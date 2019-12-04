package site.muzhi.command.commands;

/**
 * Author: lichuang
 * Date: Create in 10:04 2019/12/4
 * Description: 命令接口
 */

public interface Command {

    /**
     * 命令执行
     */
    void execute();

    /**
     * 撤销命令
     */
    void undo();
}
