package proxy;

public class ExpensiveObjectProxy implements ExpensiveObject {
    private ExpensiveObject object = new ExpensiveObjectImpl();

    @Override
    public void process() {
        object.process();
        System.out.println("Additional logging");
    }
}
