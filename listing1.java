package Pack1;
import java.util.Scanner;
//Листинг 3 тоже тут
public class listing1 {
    public static class Exception1 {
        public void exceptionDemo() {
            System.out.println( 2 / 0 );//при 2.0/0.0   :   Infinity
        }
    }
    public static class Exception2 {
        public void exceptionDemo() {
            Scanner myScanner = new Scanner( System.in );
            System.out.print( "Enter an integer ");
            String intString = myScanner.next();
            int i=0;
            try
            {
                i = Integer.parseInt(intString);
                System.out.println(2 / i);
            }
            /*catch (Exception e)//выдается ошибка
            {
                System.out.println("Something wrong");
            }*/
            catch (NumberFormatException e)//catch (Exception e) будет ловить исключения раньше, будет возникать ошибка ex. already been caught
            {
                System.out.println("Wrong type was entered");
            }
            catch (ArithmeticException e)//catch (Exception e) будет ловить исключения раньше, будет возникать ошибка ex. already been caught
            {
                System.out.println("Attempted division by zero");
            }
            finally // Выполняется вне зависимости от того, возникает ошибка или нет
            {
                System.out.println("Thank you for using this program!");
            }
        }
    }
    public static void main(String[] args) {
        Exception1 ex1 = new Exception1();
        //ex1.exceptionDemo();
        Exception2 ex2 = new Exception2();
        ex2.exceptionDemo();

    }
}
