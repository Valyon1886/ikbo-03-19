package Pack2;

public class MovableRectangle implements Movable{
    public MovablePoint topLeft;
    public MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed, ySpeed);
    }
    public String toString() {
        String inf;
        inf = "Cordinates of top left dot: Ox: " + topLeft.x + " Oy: " + topLeft.y+"\nCordinates of bottom right dot: Ox: " + bottomRight.x + " Oy: "+bottomRight.y;
        return inf;
    }
    boolean cheaker(int a, int b) {
        if (a == b)
            return true;
        else
            return false;
    }
    public void moveUp() {
        if(cheaker(topLeft.ySpeed, bottomRight.ySpeed)) {
            topLeft.y = topLeft.y + topLeft.ySpeed;
            bottomRight.y = bottomRight.y+ bottomRight.ySpeed;
        }
    }

    public void moveDown() {
        if(cheaker(topLeft.ySpeed, bottomRight.ySpeed)) {
            topLeft.y = topLeft.y - topLeft.ySpeed;
            bottomRight.y = bottomRight.y- bottomRight.ySpeed;
        }
    }

    public void moveLeft() {
        if(cheaker(topLeft.xSpeed, bottomRight.xSpeed)) {
            topLeft.x = topLeft.x - topLeft.xSpeed;
            bottomRight.x = bottomRight.x- bottomRight.xSpeed;
        }
    }

    public void moveRight() {
        if(cheaker(topLeft.xSpeed, bottomRight.xSpeed)) {
            topLeft.x = topLeft.x + topLeft.xSpeed;
            bottomRight.x = bottomRight.x+ bottomRight.xSpeed;
        }
    }
}
