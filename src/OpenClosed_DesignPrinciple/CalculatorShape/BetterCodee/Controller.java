package OpenClosed_DesignPrinciple.CalculatorShape.BetterCodee;

public class Controller {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Shape triangle = new Triangle(4,5);
        Shape rectangle = new Rectangle(5.5,7.5);
        Shape circle = new Circle(5); // Creating a Circle object
        Shape square = new Square(4); // Creating a Square object
        Shape sphere = new Sphere(6); // Creating a Sphere object
        Shape cylinder = new Cylinder(3, 7); // Creating a Cylinder object

        // ((Triangle)triangle).setBase(); although we cant make changes the attribute of the classes concrete after once instantiated but after permission of that class we can update it
        // or like this  make the triangle class object then update that



        System.out.println("Area of Triangle: "+calculator.calculateArea(triangle)); // calls Triangle calculateArea
        System.out.println("Area of Rectangle: "+calculator.calculateArea(rectangle)); // calls Rectangle calculateArea
        System.out.println("Area of Circle: " + calculator.calculateArea(circle));  // Calls Circle's calculateArea
        System.out.println("Area of Square: " + calculator.calculateArea(square));  // Calls Square's calculateArea
        System.out.println("Surface Area of Sphere: " + calculator.calculateArea(sphere));  // Calls Sphere's calculateArea
        System.out.println("Surface Area of Cylinder: " + calculator.calculateArea(cylinder));  // Calls Cylinder's calculateArea
    }
}
