package creational.singleton;
/*
* Use the Singleton pattern when you need to ensure that a class has only one instance,
*  and you want to provide a global access point to that instance.
* */
public class Singleton {
    private static volatile Singleton instance;
    private Singleton(){
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
