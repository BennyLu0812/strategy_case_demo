package strategy_pattern;

/**
 * @description: 四肢動物的行走方式。
 * @author: Benny
 * @create: 2021-08-23 11:46
 * @Version：1.0
 **/
public class TetrapodsStrategy implements IRunBehaviorStrategy {

    @Override
    public String doExecute() {
        return "四肢行走";
    }
}
