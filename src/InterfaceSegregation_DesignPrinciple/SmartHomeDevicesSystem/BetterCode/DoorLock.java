package InterfaceSegregation_DesignPrinciple.SmartHomeDevicesSystem.BetterCode;

public class DoorLock implements Operation , Lockable{
    @Override
    public void lock() {
        System.out.println("Lock the Door ");
    }

    @Override
    public void unlock() {
        System.out.println("Unlock the Door ");
    }
}
