package Pack2;

public class MovableCircle implements Movable {
    public int radius;
    public MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center=new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius=radius;
    }
    public String toString() {
        String inf;
        inf = "Cordinates: Ox: " + center.x + " Oy:" + center.y+" Radius: "+ radius;
        return inf;
    }
    public void moveUp() {
        center.y = center.y + center.ySpeed;
    }

    public void moveDown() {
        center.y = center.y - center.ySpeed;
    }

    public void moveLeft() {
        center.x = center.x - center.xSpeed;
    }

    public void moveRight() {
        center.x = center.x + center.xSpeed;
    }
}
