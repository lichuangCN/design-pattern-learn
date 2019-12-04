package site.muzhi.command.commands;

import site.muzhi.command.LightReceiver;

/**
 * Author: lichuang
 * Date: Create in 10:16 2019/12/4
 * Description:
 */

public class LightOnCommand implements Command {

    private LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
