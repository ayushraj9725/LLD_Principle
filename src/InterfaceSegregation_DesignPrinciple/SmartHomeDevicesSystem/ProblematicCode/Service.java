package InterfaceSegregation_DesignPrinciple.SmartHomeDevicesSystem.ProblematicCode;

public class Service {

    private final SmartDevice smartDevice ;
    private int speed ;
    private int temp ;
    public Service(SmartDevice smartDevice) {
        this.smartDevice = smartDevice;
    }

    public void turnOn()  {
        smartDevice.turnOn();
    }

    public void turnOff() throws UnsupportedOperationException {
        smartDevice.turnOff();
    }

    public void setSpeed(int speed) throws UnsupportedOperationException {
        smartDevice.setSpeed(speed);
    }

    public void setTemperature(int temp) throws UnsupportedOperationException {
        smartDevice.setTemperature(temp);
    }

    public void lock() throws UnsupportedOperationException {
        smartDevice.lock();
    }

    public void unlock() throws UnsupportedOperationException {
        smartDevice.unlock();
    }


}
