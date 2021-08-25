package command_pattern.receiver;

/**
 * @description: 接收者實現類：LED 燈泡。
 * @author: Benny
 * @create: 2021-08-25 15:06
 * @Version：1.0
 **/
public class LightReceiver implements IReceiver {

    @Override
    public void doTurnON() {
        System.out.println("开LED燈");
    }
    @Override
    public void doTurnOff() {
        System.out.println("关LED燈");
    }
}
