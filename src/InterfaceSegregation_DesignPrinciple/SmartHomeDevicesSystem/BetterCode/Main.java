package InterfaceSegregation_DesignPrinciple.SmartHomeDevicesSystem.BetterCode;

public class Main {
    public static void main(String[] args) {

        try {
            Operation light = new Light();
            Service service = new Service(light);

            try {
                service.turnOn();
                service.turnOff();
            } catch (UnsupportedOperationException e) {
                System.out.println("Error: " + e.getMessage());
            }

            finally {
                try {
                    service.lock();
                } catch (UnsupportedOperationException e) {
                    System.out.println("Error in lock: " + e.getMessage());
                }
            }

        } catch (UnsupportedOperationException e) {
            System.out.println("Error : " +e.getMessage());
        }

        System.out.println("/***************/*****************/****************/");

        try {
            Operation fan = new Fan();
            Service service0 = new Service(fan);
            service0.turnOn();
            service0.setSpeed(23);
            service0.turnOff();

        } catch (UnsupportedOperationException e) {
            System.out.println("Error : " +e.getMessage());
        }

        System.out.println("/***************/*****************/****************/");

        try {
            Operation thermostat = new Thermostat();
            Service service1 = new Service(thermostat);
            service1.turnOn();
            service1.setTemperature(36);
            service1.turnOff();
            service1.lock();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error : " +e.getMessage());
        }

        System.out.println("/***************/*****************/****************/");

        try {
            Operation door = new DoorLock();
            Service service2 = new Service(door);
            service2.lock();
            service2.unlock();
            service2.turnOn();
        } catch (UnsupportedOperationException e) {
            System.out.println("Error : " +e.getMessage());
        }


    }
}
