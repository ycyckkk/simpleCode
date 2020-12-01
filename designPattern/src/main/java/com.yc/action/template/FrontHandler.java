package action.template;

/**
 * @Author yucheng
 * @Date 2020/12/1 19:06
 */
public class FrontHandler extends Handler {
    @Override
    public void doWorkBefore() {
        System.out.println("打开VS Code，打开浏览器");
    }

    @Override
    public void doWorkAfter() {
        System.out.println("关闭VS Code，关闭浏览器");

    }
}
