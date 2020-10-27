package Pack1;

public class listing5 {
    public static class ThrowsDemo {
        public void printMessage(String key) {
            String message = getDetails(key); System.out.println( message );
        }
        public String getDetails(String key) {
            try {
                if(key == null) {
                    throw new NullPointerException();
                }
            }
            catch (NullPointerException e)
            {
                System.out.print("null key in getDetails");
            }
            return "data for " + key; }
    }
    public static void main(String[] args) {
        listing5.ThrowsDemo ex = new listing5.ThrowsDemo();
        ex.printMessage("fog");
        ex.printMessage(null);
    }
}
