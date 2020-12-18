package proxy;

public class VeryExpensiveObjectImpl implements ExpensiveObject {

    public VeryExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("VeryExpensive processing complete.");
    }

    private void heavyInitialConfiguration() {
        System.out.println("Loading initial configuration..");
    }

}
