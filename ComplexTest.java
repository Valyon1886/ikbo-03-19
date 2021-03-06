package Complex;

public class ComplexTest {
    public static void main(String[] args) {
        Complex a = new Complex(2, -7);
        System.out.println(a);

        ComplexAbstractFactory b = new ConcreteFactory();
        Complex c = b.createComplex(66, 0);
        System.out.println(c);

        ConcreteFactory d = new ConcreteFactory();
        Complex f = d.createComplex();
        System.out.println(f);
    }
}