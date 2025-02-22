package InterfaceSegregation_DesignPrinciple.SmartHomeDevicesSystem.BetterCode;

public class Fan implements Operation , Switchable , AdjustableSpeed{
    @Override
    public void setSpeed(int speed) {
        System.out.println("set the Speed "+speed+" of the Fan");
    }

    @Override
    public void turnOn() {
        System.out.println("Switch ON the Fan ");
    }

    @Override
    public void turnOff() {
        System.out.println("Switch OFF the Fan ");
    }
}
