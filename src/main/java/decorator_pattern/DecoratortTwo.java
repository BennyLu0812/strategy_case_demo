package decorator_pattern;

/**
 * @description: 口味添加劑2
 * @author: Benny
 * @create: 2021-08-20 18:32
 * @Version：1.0
 **/
public class DecoratortTwo extends DecoratorSuperClass {

    public ABeverages beverages;

    public DecoratortTwo(ABeverages beverages) {
        this.beverages = beverages;
    }

    @Override
    public String getDesc() {
        return this.beverages.getDesc() + "+ ice";
    }

    @Override
    double getCost() {
        return this.beverages.getCost() + 1.0;
    }
}
