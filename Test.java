package Pack2;

public class Test {
    public static void main(String[] args) {
        MovablePoint dot = new MovablePoint(0, 0, 13, 13);
        System.out.println(dot);
        dot.moveDown();
        System.out.println(dot);
        MovableCircle okr = new MovableCircle(0,0, 14, 14, 5);
        System.out.println(okr);
        okr.moveUp();
        System.out.println(okr);
        MovableRectangle sqr = new MovableRectangle(0, 0, 12, 6, 5, 6);
        System.out.println(sqr);
        sqr.moveRight();
        System.out.println(sqr);
        sqr.moveLeft();
        System.out.println(sqr);
    }
}
