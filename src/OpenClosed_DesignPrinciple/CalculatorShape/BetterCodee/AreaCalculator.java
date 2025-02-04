package OpenClosed_DesignPrinciple.CalculatorShape.BetterCodee;


public class AreaCalculator {
    public double calculateArea(Shape shape){
        return shape.calculateArea();
    }
}



/*
 THIS CLASS MADE CLOSED FOR MODIFICATION IT ONLY WORK WHEN SHAPE OBJECT WHENEVER PASSED IN THIS THEN POLYMORPHISM WORK
 -> HOW IT IS WORKING WE SEE BELOW

** The reason we make the method calculateArea() in the AreaCalculator class call shape.calculateArea()
  (which is the same method name) is polymorphism. This allows the AreaCalculator class to remain generic,
  enabling it to handle any shape that implements the Shape interface, while delegating the actual area calculation
  to the specific shape's implementation.

 # Here’s why this approach works and makes sense:

 1. Delegation to the Shape Class:
      The calculateArea() method in the AreaCalculator class simply delegates the task of calculating the area to the shape
      object passed into it.

      The argument shape is of type Shape, which is an interface or abstract class, and can represent any specific shape
      like Circle, Square, Rectangle, etc.

      Each specific shape (like Circle or Square) implements its own calculateArea() method, which contains the logic for
      calculating the area for that particular shape.

 2. Polymorphism in Action:
      The AreaCalculator class does not need to know what specific shape it is dealing with. It just knows that it is dealing
      with a Shape object, which has a calculateArea() method.

      When the AreaCalculator calls shape.calculateArea(), the actual method that gets invoked depends on the type of the
      object passed to it. This is where polymorphism comes into play.

      If the object passed is a Circle, the calculateArea() method of the Circle class will be called.
      If the object passed is a Square, the calculateArea() method of the Square class will be called.

      This allows the AreaCalculator to work with any shape that implements the Shape interface, making it extensible
      without modifying the AreaCalculator class itself.


 @ Why Do We Call calculateArea() Inside AreaCalculator?

      Encapsulation: The AreaCalculator is responsible for calculating the area of a shape.
      It doesn't need to know the specifics of how the area is calculated for different shapes
      (that's the job of the shape classes). Instead, it delegates the task to the Shape object itself, which implements
      the calculateArea() method.

      Extensibility and Flexibility: With this design, if you add new shapes, such as Rectangle, Triangle, or Polygon,
      we don’t need to modify the AreaCalculator class at all. You just need to create a new shape class that implements
      the Shape interface and provides its own implementation of calculateArea().
      This makes the code follow the Open/Closed Principle (open for extension, closed for modification).

      Single Responsibility: The AreaCalculator class has a single responsibility: calculating the area of a shape.
      It delegates the calculation details to the individual shape classes, making the code more modular and maintainable.


 */