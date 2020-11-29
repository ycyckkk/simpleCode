package action.responsibilitychain;

/**
 * @Author yucheng
 * @Date 2020/11/29 17:23
 */
public class ManagerHandler implements Handler {
    @Override
    public Boolean process(Request request) {
        if (request.getAmount() > 10000) {
            return Boolean.FALSE;
        } else {
            return "David".equals(request.getName());
        }
    }
}
