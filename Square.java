package Pack1;
import java.math.*;
public class Square extends Rectangle{
    protected double side;
    Square(){};
    Square(double side1){
           side = side1;
    }
    Square(double side1, String color, boolean filled){
        //super(color, filled);
        side = side1;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.width = side;
    }

    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public double getArea(){
        return side*side;
    }
    @Override
    public double getPerimeter(){return side*4;}



    @Override
    public String toString() {
        String inf;
        inf = "Side: "+side;
        return inf;
    }
}
