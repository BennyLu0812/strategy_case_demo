package strategy_pattern;

/**
 * @description: 雙足動物的行走方式
 * @author: Benny
 * @create: 2021-08-23 11:49
 * @Version：1.0
 **/
public class BipedalStrategy implements IRunBehaviorStrategy {
    @Override
    public String doExecute() {
        return "雙足行走";
    }
}
