//package action.responsibilitychain;
//
///**
// * @Author yucheng
// * @Date 2020/11/29 17:41
// */
//public class ChainTest {
//    public static void main(String[] args) {
//        Handler handler1 = new CEOHandler();
//        Handler handler2 = new ManagerHandler();
//        Handler handler3 = new DirectorHandler();
//
//        Request request = new Request("Bob",500);
//
//
//        Chain chain = new Chain();
//        chain.addHandlerList(handler3);
//        chain.addHandlerList(handler2);
//        chain.addHandlerList(handler1);
//        chain.process(request);
//
//    }
//}
