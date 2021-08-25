package abstract_factory_pattern.factory;

import abstract_factory_pattern.produce.IKeyboard;
import abstract_factory_pattern.produce.IMouse;
import abstract_factory_pattern.produce.MacbookKeyboard;
import abstract_factory_pattern.produce.MacbookMouse;

/**
 * @description: 工廠實現類2
 * @author: Benny
 * @create: 2021-08-24 16:00
 * @Version：1.0
 **/
public class MacbookFactory implements IFactory {
    @Override
    public IMouse getMouse() {
        return new MacbookMouse();
    }

    @Override
    public IKeyboard getKeyboard() {
        return new MacbookKeyboard();
    }
}
