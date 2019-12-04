package site.muzhi.command;

import site.muzhi.command.commands.LightOffCommand;
import site.muzhi.command.commands.LightOnCommand;
import site.muzhi.command.commands.TVOffCommand;
import site.muzhi.command.commands.TVOnCommand;

/**
 * Author: lichuang
 * Date: Create in 10:47 2019/12/4
 * Description:
 */

public class Client {

    public static void main(String[] args) {
        RemoteController controller = new RemoteController();
        LightReceiver light = new LightReceiver();
        controller.setOnCommands(0, new LightOnCommand(light), new LightOffCommand(light));
        TVReceiver tv = new TVReceiver();
        controller.setOnCommands(1, new TVOnCommand(tv), new TVOffCommand(tv));

        controller.onButtonWasPushed(0);
        controller.onButtonWasPushed(1);
        controller.offButtonWasPushed(0);
        controller.offButtonWasPushed(1);
        controller.undoButtonWasPushed();
    }
}
