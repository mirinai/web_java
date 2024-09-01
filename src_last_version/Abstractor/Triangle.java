package Abstractor;

public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height=height;

    }
    @Override
    public void getting_area() {
        System.out.printf("세모 넓이 = %.2f",this.base*this.height/2.0);
    }
}
