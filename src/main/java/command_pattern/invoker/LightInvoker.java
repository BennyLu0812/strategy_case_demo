package command_pattern.invoker;

import command_pattern.command.ICommand;
import command_pattern.command.LightCommand;
import command_pattern.receiver.LightReceiver;

/**
 * @description: 調用者，燈的遙控器
 * @author: Benny
 * @create: 2021-08-25 15:19
 * @Version：1.0
 **/
public class LightInvoker {

    private ICommand lightButton;

    private ICommand colorButton;

    public LightInvoker(ICommand lightButton, ICommand colorButton) {
        this.lightButton = lightButton;
        this.colorButton = colorButton;
    }


    public void doClickTurnOnLightButton() {
        lightButton.doExecute();
    }

    public void doClickTurnOffLightButton() {
        lightButton.doUnExecute();
    }

    public void doClickChangeColorButton() {
        colorButton.doExecute();
    }

    public void doClickResetColorButton() {
        colorButton.doUnExecute();
    }


}
