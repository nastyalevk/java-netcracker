package singleton;

public class Singleton {
    private static Singleton INSTANCE;
    private String info = "Initial info class";

    private Singleton() {
    }

    public synchronized static Singleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }

    public static Singleton getINSTANCE() {
        return INSTANCE;
    }

    public static void setINSTANCE(Singleton INSTANCE) {
        Singleton.INSTANCE = INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
