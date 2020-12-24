package facade.car;

public class CoolingController {

    private static final Integer DEFAULT_RADIATOR_SPEED = 10;

    private Integer temperatureUpperLimit;
    private Radiator radiator = new Radiator();
    private TemperatureSensor temperatureSensor = new TemperatureSensor();

    public void setTemperatureUpperLimit(Integer temperatureUpperLimit){
        System.out.println(String.format("Setting temperature upper limit to %d", temperatureUpperLimit));
        this.temperatureUpperLimit = temperatureUpperLimit;
    }

    public void run(){
        System.out.println("Cooling Controller ready!");
        radiator.setSpeed(DEFAULT_RADIATOR_SPEED);
    }

    public void cool(Integer maxAllowedTemp){
        System.out.println(String.format("Scheduled cooling with maximum allowed temperature %s0", maxAllowedTemp));
        temperatureSensor.getTemperature();
        radiator.on();
    }

    public void stop(){
        System.out.println("Stopping Cooling Controller..");
        radiator.off();
    }


}
