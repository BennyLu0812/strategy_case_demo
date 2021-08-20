package decorator_strategy;

/**
 * @description: 口味添加劑1
 * @author: Benny
 * @create: 2021-08-20 17:28
 * @Version：1.0
 **/
public class DecoratorOne extends DecoratorSuperClass {

    public ABeverages beverages;

    public DecoratorOne(ABeverages beverages) {
        this.beverages = beverages;
    }

    @Override
    public String getDesc() {
        return this.beverages.getDesc() + "+ 牛奶";
    }

    @Override
    double getCost() {
        return this.beverages.getCost() + 2.0;
    }
}
