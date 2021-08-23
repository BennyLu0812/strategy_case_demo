package strategy_pattern;

/**
 * @description: 動物類
 * @author: Benny
 * @create: 2021-08-23 11:50
 * @Version：1.0
 **/
public class Animal {


    public IRunBehaviorStrategy runBehavior;

    public Animal(IRunBehaviorStrategy runBehavior) {
        this.runBehavior = runBehavior;
    }

    public String doRun() {
        return runBehavior.doExecute();
    };

}
