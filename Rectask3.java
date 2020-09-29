package Pack1;
import java.util.Scanner;
public class Rectask3 {
    public static int recursion(int a1, int b1) {
        if  (a1 == b1){
            System.out.print(b1);
            return b1;
        }
        if(a1<b1) {
            System.out.print(a1+" ");
            a1 = a1+1;
            return recursion(a1, b1);
        }
        if(a1>b1) {
            System.out.print(b1 + " ");
            b1 = b1 + 1;
            return recursion(a1, b1);
        }
        return 0;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int d=0;
        System.out.print("Введите два числа: ");
        a = sc.nextInt();
        b = sc.nextInt();
        d= recursion(a, b);

    }
}
