package InterfaceSegregation_DesignPrinciple.SmartHomeDevicesSystem.ProblematicCode;

public class Door implements  SmartDevice{

    @Override
    public void turnOn()  throws  UnsupportedOperationException {
        throw  new UnsupportedOperationException("not support this operation ");
    }

    @Override
    public void turnOff() throws  UnsupportedOperationException {
        throw  new UnsupportedOperationException("not support this operation ");
    }

    @Override
    public void setTemperature(int temp) throws  UnsupportedOperationException {
        throw  new UnsupportedOperationException("not support this operation ");
    }

    @Override
    public void setSpeed(int speed) throws  UnsupportedOperationException {
        throw  new UnsupportedOperationException("not support this operation ");
    }

    @Override
    public void lock() throws UnsupportedOperationException{
        System.out.println("Lock the Door !");
    }

    @Override
    public void unlock() throws UnsupportedOperationException{
        System.out.println("Unlock the door ");

    }
}
