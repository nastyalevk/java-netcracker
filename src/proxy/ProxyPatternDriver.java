package proxy;

public class ProxyPatternDriver {
    public static void main(String[] args) {
        ExpensiveObject proxyObject = new ExpensiveObjectProxy(new ExpensiveObjectImpl());
        proxyObject.process();
        proxyObject.process();

        System.out.println("\n");

        ExpensiveObject proxyVeryObject = new ExpensiveObjectProxy(new VeryExpensiveObjectImpl());
        proxyVeryObject.process();
        proxyVeryObject.process();
    }
}
