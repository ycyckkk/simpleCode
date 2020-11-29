package create.singleton;


public class Singleton1 {
    volatile static Singleton1 singleton1 = null;

    /***
     *
     * @return
     */
    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            synchronized (Singleton1.class) {
                if (singleton1 == null) {
                    singleton1 = new Singleton1();
                }
            }
        }
        return singleton1;
    }

}
