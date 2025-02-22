package InterfaceSegregation_DesignPrinciple.SmartHomeDevicesSystem.BetterCode;

public class Thermostat implements Operation , Switchable , AdjustableTemperature{
    @Override
    public void setTemperature(int temp) {
        System.out.println("Set the Temperature "+temp+ " of the Thermostat");
    }

    @Override
    public void turnOn() {
        System.out.println("Switch ON the Thermostat ");
    }

    @Override
    public void turnOff() {
        System.out.println("Switch OFF the Thermostat ");
    }
}
