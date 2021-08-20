package decorator_strategy;

/**
 * @description: 飲料coffe。
 * @author: Benny
 * @create: 2021-08-19 11:22
 * @Version：1.0
 **/
public class Coffee extends ABeverages {

    public Coffee() {
        this.desc = "咖啡";
    }

    @Override
    double getCost() {
        return 9.9;
    }
}
