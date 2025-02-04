package OpenClosed_DesignPrinciple.CalculatorShape.BetterCodee;

public class Sphere implements Shape{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * radius * radius; // Surface area of a sphere
    }

}
