package single_pattern;

/**
 * @description: 定義個單例實體
 * @author: Benny
 * @create: 2021-08-25 09:13
 * @Version：1.0
 **/
public class SingleEntity {

    // 1、私有化、靜態、自己的屬性
    private static  SingleEntity entity;

    // 2、私有化構造函數
    private SingleEntity() {
    }

    // 3、提供一個全局的接口，提供創建實例。
    public static SingleEntity getInstance() {
        if (entity == null) {
            entity = new SingleEntity();
        }
        return entity;
    }

    public void getMsg() {
        System.out.println("此實體的hashcode為：" + entity.hashCode());
    }

}
