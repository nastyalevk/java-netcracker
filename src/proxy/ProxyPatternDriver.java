package proxy;

public class ProxyPatternDriver {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        ExpensiveObject object = new ExpensiveObjectImpl();
        object.process();
        object.process();
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Just implementation " + timeSpent + " millis");

        long startTimeProxy = System.currentTimeMillis();
        ExpensiveObject proxyObject = new ExpensiveObjectProxy();
        proxyObject.process();
        proxyObject.process();
        long timeSpentProxy = System.currentTimeMillis() - startTimeProxy;
        System.out.println("Proxy " + timeSpentProxy + " millis");

    }
}
