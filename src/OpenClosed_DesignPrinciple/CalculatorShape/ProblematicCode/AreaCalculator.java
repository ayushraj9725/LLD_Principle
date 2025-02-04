package OpenClosed_DesignPrinciple.CalculatorShape.ProblematicCode;

// what is the problem over here in this class  .
// we want to calculate the area of different shape Like ( circle , rectangle , Triangle , square etc)
// but in this area calculator class there is condition having when we want to introduce some new shape and have to calculate area for that
// then we have to do the modification in this particular class and write code for the methods
// In this example, every time a new shape is added, you have to modify the AreaCalculator class, violating the Open/Closed Principle.

/*

Instead, the AreaCalculator class should be closed for modification but open for extension.

So we can achieve this by using polymorphism. Each shape can implement an interface or an abstract class,
and the calculateArea method can be extended without modifying the original AreaCalculator class.

// we are writing the code into this better code package go and see there

 */

public class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            return Math.PI * ((Circle) shape).getRadius() * ((Circle) shape).getRadius();

        } else if (shape instanceof Square) {
            return ((Square) shape).getSide() * ((Square) shape).getSide();
        }
        // New code here for other shapes
        return 0;
    }
}
