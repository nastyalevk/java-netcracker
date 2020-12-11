package singleton;

public class DclSingleton {
    // volatile - kinda synchronized variable, but avoid ++ -- operations
    private static volatile DclSingleton instance;
    private String value;

    private DclSingleton(String value) {
        this.value = value;
    }

    public static DclSingleton getInstance(String str) {
        if (instance == null) {
            synchronized (DclSingleton.class) {
                if (instance == null) {
                    instance = new DclSingleton(str);
                }
            }
        }
        return instance;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static void setInstance(DclSingleton instance) {
        DclSingleton.instance = instance;
    }
}
