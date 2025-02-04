package OpenClosed_DesignPrinciple.CalculatorShape.BetterCodee;

public interface Shape {
    double calculateArea(); // this is the abstract method , when ever we need to use it simple we can implement this interface
    // and use this for calculating area in diff shape by making class and implementation of this method in that class
}
