package abstract_factory_pattern.factory;

import abstract_factory_pattern.produce.IKeyboard;
import abstract_factory_pattern.produce.IMouse;
import abstract_factory_pattern.produce.LenoveKeyboard;
import abstract_factory_pattern.produce.LenoveMouse;

/**
 * @description:
 * @author: Benny
 * @create: 2021-08-24 16:01
 * @Version：1.0
 **/
public class LenoveFactory implements IFactory {
    @Override
    public IMouse getMouse() {
        return new LenoveMouse();
    }

    @Override
    public IKeyboard getKeyboard() {
        return new LenoveKeyboard();
    }
}
