package InterfaceSegregation_DesignPrinciple.SmartHomeDevicesSystem.BetterCode;

public class Light implements Operation , Switchable{
    @Override
    public void turnOn() {
        System.out.println("Switch ON the Light ");
    }

    @Override
    public void turnOff() {
        System.out.println("Switch OFF the Light ");
    }


}
