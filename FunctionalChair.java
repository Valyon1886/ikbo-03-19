package FacChairs;

public class FunctionalChair implements Chair{
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public boolean run() {
        sum(99, -99);
        return true;
    }
}
