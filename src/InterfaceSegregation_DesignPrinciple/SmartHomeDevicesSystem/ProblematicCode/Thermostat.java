package InterfaceSegregation_DesignPrinciple.SmartHomeDevicesSystem.ProblematicCode;

public class Thermostat implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("Switch ON the thermostat");
    }

    @Override
    public void turnOff() {
        System.out.println("Switch OFF the thermostat");
    }

    @Override
    public void setTemperature(int temp) {
        System.out.println("Set the temperature" + temp + " of the thermostat ");
    }

    @Override
    public void setSpeed(int speed)  throws  UnsupportedOperationException {
        throw  new UnsupportedOperationException("not support this operation ");
    }

    @Override
    public void lock() throws  UnsupportedOperationException {
        throw  new UnsupportedOperationException("not support this operation ");
    }

    @Override
    public void unlock()  throws  UnsupportedOperationException {
        throw  new UnsupportedOperationException("not support this operation ");
    }


}
