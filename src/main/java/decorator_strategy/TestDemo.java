package decorator_strategy;

/**
 * @description:
 * @author: Benny
 * @create: 2021-08-20 17:34
 * @Version：1.0
 **/
public class TestDemo {

    public static void main(String[] args) {
        // 定義咖啡這款飲料 原始價格9.9 元
        ABeverages coffee = new Coffee();

        // 創建調位料
        coffee = new DecoratorOne(coffee);
        System.out.println(coffee.getDesc() + "共" + coffee.getCost() + "元");
        coffee = new DecoratortTwo(coffee);

        System.out.println(coffee.getDesc() + "共" + coffee.getCost() + "元");


    }
}
