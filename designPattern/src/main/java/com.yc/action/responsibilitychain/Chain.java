package action.responsibilitychain;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yucheng
 * @Date 2020/11/29 17:35
 */
public class Chain {
    List<Handler> handlerList = new ArrayList<>();

    public Chain() {
    }

    public void addHandlerList(Handler handler) {
        handlerList.add(handler);
    }

    public void process(Request request) {
        if (handlerList.size() < 1) {
            return;
        }
        System.out.println("数据-处理人：" + request.getName() + "，处理金额：" + request.getAmount());
        for (Handler handler : handlerList) {
            Boolean r = handler.process(request);
            if (r != null && !r) {
                System.out.println("还在处理类：" + handler.getClass().getName() + "处理结果：" + r);
//                process(request);
            } else if (r) {
                System.out.println("成功处理类：" + handler.getClass().getName() + "处理结果：" + r);
                return;
            } else {
                System.out.println("失败处理类：" + handler.getClass().getName() + "处理结果：" + r);
                return;
            }
        }
    }
}
