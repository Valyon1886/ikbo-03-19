package Pack1;

public class listing2 {
        public static class Exception1 {
            public void exceptionDemo() {
                try
                {
                    System.out.println(2 / 0);
                }
                catch (ArithmeticException e)
                {
                    System.out.println("Attempted division by zero");
                }

            }
        }
        public static void main(String[] args) {
            Pack1.listing2.Exception1 ex = new Pack1.listing2.Exception1();
            ex.exceptionDemo();
        }

}
