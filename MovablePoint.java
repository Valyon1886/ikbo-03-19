package Pack2;

public class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        String inf;
        inf = "Cordinates: Ox: " + x + " Oy:" + y;
        return inf;
    }

    public void moveUp() {
        y = y + ySpeed;
    }

    public void moveDown() {
        y = y - ySpeed;
    }

    public void moveLeft() {
        x = x - xSpeed;
    }

    public void moveRight() {
        x = x + xSpeed;
    }
}
