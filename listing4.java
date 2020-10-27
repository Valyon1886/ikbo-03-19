package Pack1;

public class listing4 {
    public static class ThrowsDemo {
        public void getDetails(String key) {
            try {
                if(key == null) {
                    throw new NullPointerException();
                }
            }
            catch (NullPointerException e)
            {
                System.out.print("null key in getDetails");
            }
           /* if(key == null) {
                throw new NullPointerException( "null key in getDetails" );
            }*/
            // do something with the key
        }
    }
    public static void main(String[] args) {
        listing4.ThrowsDemo ex = new listing4.ThrowsDemo();
        ex.getDetails(null);//Exception in thread "main" java.lang.NullPointerException: null key in getDetails
    }
}
