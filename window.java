package Pack1;
import java.io.*;
import java.util.Scanner;

public class window {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (FileWriter writer = new
                FileWriter("C:\\Users\\Valyon\\Desktop\\TESTFILE.txt", false)) {
            String text = sc.nextLine();
            writer.write(text);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader("C:\\Users\\Valyon\\Desktop\\TESTFILE.txt")) {
// читаемпосимвольно
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
