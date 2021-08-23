package strategy_pattern;

/**
 * @description: 定義一個行走的策略。
 * @author: Benny
 * @create: 2021-08-23 11:39
 * @Version：1.0
 **/
public interface IRunBehaviorStrategy {

    // 行走方式。
    public String doExecute();
}
