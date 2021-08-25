package abstract_factory_pattern.produce;

/**
 * @description: 鍵盤實現類2
 * @author: Benny
 * @create: 2021-08-24 15:57
 * @Version：1.0
 **/
public class MacbookKeyboard implements IKeyboard {
    @Override
    public String getName() {
        return "蘋果電腦的鍵盤";
    }
}
