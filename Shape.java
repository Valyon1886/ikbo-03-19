package Pack1;

public abstract class Shape {
    private String color;
    private boolean filled;

    Shape(){};
    Shape(String color1, boolean filled1){
        color=color1;
        filled=filled1;
    }
    public String getColor(){return color;}
    public boolean isFilled() {return filled;}
    public void setColor(String color1){color = color1;}
    public void setFilled(boolean filled1){filled=filled1;}
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
