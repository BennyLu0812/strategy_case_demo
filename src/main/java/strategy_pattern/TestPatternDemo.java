package strategy_pattern;

/**
 * @description: 測試策略模式。
 * 總結： 把算法抽离出来，使用组合而不是继承。
 * @author: Benny
 * @create: 2021-08-23 12:16
 * @Version：1.0
 **/
public class TestPatternDemo {

    public static void main(String[] args) {

        Animal animalA = new Animal(new BipedalStrategy());
        System.out.println("Chicken是：" + animalA.doRun());

        Animal animalB= new Animal(new TetrapodsStrategy());
        System.out.println("Cat是：" + animalB.doRun());

        Animal animalC= new Animal(new TetrapodsStrategy());
        System.out.println("Dog是：" + animalC.doRun());
    }
}
