package Pack1;
public class Circle extends Shape {
    protected double radius;

    Circle() {};

    Circle(double rad) {
        radius = rad;
    }

    Circle(double rad, String color, boolean filled) {
        super(color, filled);
        radius = rad;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        String inf;
        inf = "Radius: "+radius+" Area: "+getArea()+" Perimeter: "+getPerimeter();
        return inf;
    }
}
