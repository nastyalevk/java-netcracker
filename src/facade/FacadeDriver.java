package facade;

public class FacadeDriver {
    public static void main(String[] args) {
        CarEngineFacade carEngineFacade = new CarEngineFacade();
        System.out.println("\nStart Engine ... \n");
        carEngineFacade.startEngine();
        System.out.println("\nStop Engine ... \n");
        carEngineFacade.stopEngine();
    }
}
