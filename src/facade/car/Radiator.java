package facade.car;

public class Radiator {

    public void setSpeed(Integer speed) {
        System.out.println(String.format("Setting radiator speed to %d", speed));
    }

    public void on() {
        System.out.println("Radiator switched on");
    }

    public void off() {
        System.out.println("Radiator switched off");
    }
}
