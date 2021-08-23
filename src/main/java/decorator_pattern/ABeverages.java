package decorator_pattern;

/**
 * @description: 飲料抽象類。
 * @author: Benny
 * @create: 2021-08-19 11:08
 * @Version：1.0
 **/
public abstract class ABeverages {

    public String desc = "unknow beverage";
    public String getDesc() {
        return desc;
    };

    // 定義抽象方法：獲得描述
    abstract double getCost();

}
