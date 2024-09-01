package Abstractor;

public class Circle extends Shape{
    private double radius;
    private double area;

    public Circle(double radius, double area){
        this.radius=radius;

    }
    @Override
    public void getting_area() {
        this.area = 3.14*this.radius*this.radius;
        System.out.printf("Area of The Circle = %.2f",this.area);
    }
}
