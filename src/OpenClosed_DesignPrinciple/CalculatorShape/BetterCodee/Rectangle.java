package OpenClosed_DesignPrinciple.CalculatorShape.BetterCodee;

public class Rectangle implements Shape{
    private double width ;
    private double height ;

    public Rectangle(double width , double height) {
        this.width = width ;
        this.height = height ;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return width * height ;
    }
}
