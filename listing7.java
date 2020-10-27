package Pack1;

import java.util.Scanner;

public class listing7 {
    public static class ThrowsDemo {
        public void getKey() {
            Scanner myScanner = new Scanner( System.in );
            System.out.print("Enter Key ");
            String key = myScanner.nextLine();
            printDetails( key );
        }
        public void printDetails(String key)  {
            String message = getDetails(key);
            System.out.println( message ); }
        private String getDetails(String key)  {
            if(key.equals("")) {
                try {
                    throw new Exception( "Key set to empty string" );
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return "data for " + key;
        }
    }
    public static void main(String[] args) {
        listing7.ThrowsDemo ex = new listing7.ThrowsDemo();
            ex.getKey();
    }
}
