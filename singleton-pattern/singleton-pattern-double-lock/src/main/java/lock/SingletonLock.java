package lock;

public class SingletonLock {

    private volatile static SingletonLock singleton; //静态带有锁实例
    private SingletonLock (){
        System.out.println("aaaaa");
    }
    public static SingletonLock getSingleton() {
        if (singleton == null) {
            synchronized (SingletonLock.class) { //锁块
                if (singleton == null) {
                    singleton = new SingletonLock();
                }
            }
        }
        return singleton;
    }


}
