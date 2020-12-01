package structure.adapter;

/**
 * @Author yucheng
 * @Date 2020/12/1 22:55
 */
public class InlandPhone implements InlandAdapter {
    @Override
    public String recharge() {
        return "InlandPhone recharge";
    }
}
