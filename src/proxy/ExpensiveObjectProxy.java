package proxy;

public class ExpensiveObjectProxy implements ExpensiveObject {

    private ExpensiveObject expensiveObject;

    public ExpensiveObjectProxy(ExpensiveObject expensiveObject) {
        this.expensiveObject = expensiveObject;
    }

    @Override
    public void process() {
        expensiveObject.process();
        System.out.println("Additional logging");
    }
}
