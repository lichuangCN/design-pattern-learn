package site.muzhi.command.commands;

import site.muzhi.command.TVReceiver;

/**
 * Author: lichuang
 * Date: Create in 10:44 2019/12/4
 * Description:
 */

public class TVOnCommand implements Command {

    private TVReceiver tv;

    public TVOnCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }
}
