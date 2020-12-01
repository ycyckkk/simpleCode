package structure.decorator;

/**
 * @Author yucheng
 * @Date 2020/12/1 23:11
 */
public class CookGreenPepper implements CookVegetables {
    @Override
    public String cook() {
        return "cook green pepper";
    }
}
