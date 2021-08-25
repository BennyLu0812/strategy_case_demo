package single_pattern;

/**
 * @description:
 * @author: Benny
 * @create: 2021-08-25 09:25
 * @Version：1.0
 **/
public class TestSinglePatternDemo {

    public static void main(String[] args) {

        SingleEntity test1 = SingleEntity.getInstance();
        test1.getMsg();

        SingleEntity test2 = SingleEntity.getInstance();
        test2.getMsg();

    }
}
