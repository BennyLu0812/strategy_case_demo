package command_pattern.command;

import command_pattern.receiver.IReceiver;

/**
 * @description: 命令模式
 * @author: Benny
 * @create: 2021-08-25 14:58
 * @Version：1.0
 **/
public interface ICommand {

    // 命令做某事
    public void doExecute();

    // 命令撤銷某事
    public void doUnExecute();
}
