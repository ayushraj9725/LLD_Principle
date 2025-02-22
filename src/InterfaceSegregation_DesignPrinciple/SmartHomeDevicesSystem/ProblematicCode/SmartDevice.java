package InterfaceSegregation_DesignPrinciple.SmartHomeDevicesSystem.ProblematicCode;

// PROBLEM STATEMENT :
// 🛠 Problem Statement:
// Imagine a smart home automation system where all devices (Lights, Fans, Thermostat, Door Lock) implement a single interface SmartDevice.

// WHAT DOES STATS ISP : A client should not be forced to depend on the interfaces it does not use
// what does it mean : Instead of using a single large interface with multiple responsibilities using by breaking it into smaller sub interfaces
// so that the required responsibility will be handled by the needed classes ( it can implement what they want by inheriting )

// the problems it here this SmartDevice is an interface which is large it has many responsibilities below

  /*   🚨 Issue (Violation of ISP):

        Light doesn’t need setTemperature(), setSpeed(), or lock().
        Fan doesn’t need lock() or setTemperature().
        Door Lock doesn’t need setTemperature() or setSpeed().

        ✅ Solution (Applying ISP)
        We split the interface into smaller, more relevant interfaces.  see in the better code

*/

public interface SmartDevice {


    void turnOn() throws  UnsupportedOperationException ;

    void turnOff() throws  UnsupportedOperationException ;

    void setTemperature(int temp) throws  UnsupportedOperationException ;

    void setSpeed(int speed) throws  UnsupportedOperationException;

    void lock() throws  UnsupportedOperationException;

    void unlock() throws  UnsupportedOperationException;


}
