package lock;

public class SingletonLockTest {
    public static void main(String[] args){
        SingletonLock.getSingleton();
        SingletonLock.getSingleton();
        SingletonLock.getSingleton();
    }
}
