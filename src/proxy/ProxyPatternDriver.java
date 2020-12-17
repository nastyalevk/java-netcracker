package proxy;

public class ProxyPatternDriver {
    public static void main(String[] args) {
        ExpensiveObject proxyObject = new ExpensiveObjectProxy();
        proxyObject.process();
        proxyObject.process();
    }
}
