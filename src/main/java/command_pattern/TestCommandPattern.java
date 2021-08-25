package command_pattern;

import command_pattern.command.ColorCommand;
import command_pattern.command.LightCommand;
import command_pattern.invoker.LightInvoker;
import command_pattern.receiver.LightReceiver;

/**
 * @description:
 * @author: Benny
 * @create: 2021-08-25 15:41
 * @Version：1.0
 **/
public class TestCommandPattern {

    public static void main(String[] args) {
        LightInvoker lightInvoker = new LightInvoker(
                new LightCommand(new LightReceiver()),
                new ColorCommand(new LightReceiver()));


        lightInvoker.doClickTurnOnLightButton();
    }
}
