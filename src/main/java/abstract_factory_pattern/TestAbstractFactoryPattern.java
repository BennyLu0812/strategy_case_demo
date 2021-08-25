package abstract_factory_pattern;

import abstract_factory_pattern.factory.LenoveFactory;
import abstract_factory_pattern.factory.MacbookFactory;
import abstract_factory_pattern.produce.IMouse;

/**
 * @description: 測試抽象工廠模式.
 * @author: Benny
 * @create: 2021-08-24 16:02
 * @Version：1.0
 **/
public class TestAbstractFactoryPattern {

    public static void main(String[] args) {

        // 蘋果電腦工廠
        MacbookFactory macbookFactory = new MacbookFactory();
        System.out.println(macbookFactory.getMouse().getName());
        System.out.println(macbookFactory.getKeyboard().getName());


        // 聯想電腦工廠
        LenoveFactory lenoveFactory = new LenoveFactory();
        System.out.println(lenoveFactory.getMouse().getName());
        System.out.println(lenoveFactory.getKeyboard().getName());

    }

}
