package site.muzhi.command.commands;

import site.muzhi.command.LightReceiver;

/**
 * Author: lichuang
 * Date: Create in 10:17 2019/12/4
 * Description:
 */

public class LightOffCommand implements Command {

    private LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
