package InterfaceSegregation_DesignPrinciple.SmartHomeDevicesSystem.ProblematicCode;

import java.lang.UnsupportedOperationException;

public class Main {
    public static void main(String[] args) throws  UnsupportedOperationException {

        // create the object of the light , fan , thermostat and Door

        // create the  object of the service

        try {
            SmartDevice light = new Light();
            Service lightService = new Service(light);
            lightService.turnOn();
            lightService.turnOff();
            lightService.lock();
        }
        catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }

        System.out.println("/*************************************************/");
        try {
            SmartDevice fan = new Fan();
            Service fanService = new Service(fan);
            fanService.turnOn();
            fanService.setSpeed(120);
            fanService.turnOff();
            fanService.unlock();

        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("/*************************************************/");

        try {
            SmartDevice thermostat = new Thermostat();
            Service thermostatService = new Service(thermostat);
            thermostatService.turnOn();
            thermostatService.setTemperature(70);
            thermostatService.turnOff();
            thermostatService.unlock();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("/*************************************************/");

        try {
            SmartDevice door = new Door();
            Service doorService = new Service(door);
            doorService.turnOn();
            doorService.lock();
            doorService.unlock();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

    }
}
