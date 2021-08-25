package command_pattern.command;

import command_pattern.receiver.IReceiver;

/**
 * @description: 命令模式的實現類， 燈命令
 * @author: Benny
 * @create: 2021-08-25 15:13
 * @Version：1.0
 **/
public class LightCommand implements ICommand {

    // 命令模式的實現類，有自己需要的接收者
    private IReceiver receiver;

    public LightCommand(IReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void doExecute() {
        System.out.println("命令模式可以封装一段邏輯。");
         this.receiver.doTurnON();
    }

    @Override
    public void doUnExecute() {
        System.out.println("命令模式可以封装一段邏輯。");
        this.receiver.doTurnON();
    }


}
