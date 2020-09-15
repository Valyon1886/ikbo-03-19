package ru.mirea.pra2_2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(0, 0);
        System.out.println(b1);
        b1.move(30, 45);
        System.out.println(b1);
    }
}
