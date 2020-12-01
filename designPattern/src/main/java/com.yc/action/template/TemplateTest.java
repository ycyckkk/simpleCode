package action.template;

/**
 * @Author yucheng
 * @Date 2020/12/1 19:07
 */
public class TemplateTest {
    public static void main(String[] args) {
        Handler javaHandler = new JavaHandler();
        Handler fontHandler = new FrontHandler();
        javaHandler.doWork();
        fontHandler.doWork();
    }
}
