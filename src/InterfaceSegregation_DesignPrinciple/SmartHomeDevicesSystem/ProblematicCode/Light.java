package InterfaceSegregation_DesignPrinciple.SmartHomeDevicesSystem.ProblematicCode;

public class Light implements SmartDevice{

    @Override
    public void turnOn() {
        System.out.println("Switch On the Light ");
    }

    @Override
    public void turnOff() {
        System.out.println("Switch OFF the Light ");
    }

    @Override
    public void setTemperature(int temp) throws UnsupportedOperationException{
        throw new UnsupportedOperationException("not support this operation ");
    }

    @Override
    public void setSpeed(int speed) throws  UnsupportedOperationException {
        throw new UnsupportedOperationException(" not support this operation ");
    }

    @Override
    public void lock() throws  UnsupportedOperationException {
        throw new UnsupportedOperationException("not support this operation ");
    }

    @Override
    public void unlock() throws  UnsupportedOperationException {
        throw new UnsupportedOperationException("not support this operation ");
    }

}
