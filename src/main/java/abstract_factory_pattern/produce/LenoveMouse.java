package abstract_factory_pattern.produce;

/**
 * @description: IMouse 實現類1
 * @author: Benny
 * @create: 2021-08-24 15:52
 * @Version：1.0
 **/
public class LenoveMouse implements IMouse {

    @Override
    public String getName() {
        return "聯想鼠標";
    }
}
