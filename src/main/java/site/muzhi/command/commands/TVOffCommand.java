package site.muzhi.command.commands;

import site.muzhi.command.TVReceiver;

/**
 * Author: lichuang
 * Date: Create in 10:45 2019/12/4
 * Description:
 */

public class TVOffCommand implements Command {

    private TVReceiver tv;

    public TVOffCommand(TVReceiver tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
