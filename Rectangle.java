package Pack1;
import java.math.*;
public class Rectangle extends Shape{
    protected double width;
    protected double length;

    Rectangle(){};
    Rectangle(double width1, double length1){
        width = width1;
        length = length1;
    }
    Rectangle(double width1, double length1, String color, boolean filled){
        super(color, filled);
        width = width1;
        length = length1;
    }
    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return length*width;
    }
    @Override
    public double getPerimeter() {
        return 2 * (length+width);
    }

    @Override
    public String toString() {
        String inf;
        inf = "Width: "+width+" Length: "+length+" Area: "+getArea()+" Perimeter: "+getPerimeter();
        return inf;
    }
}
