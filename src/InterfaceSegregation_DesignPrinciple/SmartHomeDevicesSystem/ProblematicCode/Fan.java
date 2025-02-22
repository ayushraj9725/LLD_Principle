package InterfaceSegregation_DesignPrinciple.SmartHomeDevicesSystem.ProblematicCode;

public class Fan implements SmartDevice{
    @Override
    public void turnOn() {
        System.out.println("Switch ON the Fan");
    }

    @Override
    public void turnOff() {
        System.out.println("Switch OFF the Fan ");
    }

    @Override
    public void setTemperature(int temp)  throws  UnsupportedOperationException {
         throw  new UnsupportedOperationException("not support this operation ");
    }

    @Override
    public void setSpeed(int speed)  {
        System.out.println("Set the speed "+speed +" of the fan");
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
