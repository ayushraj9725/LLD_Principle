package InterfaceSegregation_DesignPrinciple.SmartHomeDevicesSystem.BetterCode;

public class Service {
    private final Operation operation ;

    public Service(Operation operation) {
        this.operation = operation;
    }

    public void turnOn(){
        if(operation instanceof Switchable){
            ((Switchable) operation).turnOn();
        }else{
            throw new UnsupportedOperationException("Not supported");
        }
    }
    public void turnOff(){
        if(operation instanceof Switchable){
            ((Switchable) operation).turnOff();
        }else{
            throw new UnsupportedOperationException("Not supported");
        }
    }

    public void setSpeed(int speed){
        if(operation instanceof AdjustableSpeed){
            ((AdjustableSpeed) operation).setSpeed(speed);
        }else{
            throw new UnsupportedOperationException("Not supported");
        }
    }

    public void setTemperature(int temp){
        if(operation instanceof AdjustableTemperature){
            ((AdjustableTemperature) operation).setTemperature(temp);
        }else{
            throw new UnsupportedOperationException("Not supported");
        }
    }

    public void lock(){
        if(operation instanceof Lockable){
            ((Lockable) operation).lock();
        }else{
            throw new UnsupportedOperationException("Not supported");
        }
    }

    public void unlock(){
        if(operation instanceof  Lockable){
            ((Lockable) operation).unlock();
        }else{
            throw new UnsupportedOperationException("Not supported");
        }
    }


}
