package abstract_factory_pattern.produce;

/**
 * @description: 鍵盤實現類1
 * @author: Benny
 * @create: 2021-08-24 15:56
 * @Version：1.0
 **/
public class LenoveKeyboard implements IKeyboard {

    @Override
    public String getName() {
        return "聯想電腦鍵盤";
    }
}
