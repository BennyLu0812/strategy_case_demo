package abstract_factory_pattern.factory;

import abstract_factory_pattern.produce.IKeyboard;
import abstract_factory_pattern.produce.IMouse;

/**
 * @description: 工廠接口
 * @author: Benny
 * @create: 2021-08-24 15:48
 * @Version：1.0
 **/
public interface IFactory {

    public IMouse getMouse();
    public IKeyboard getKeyboard();

}
