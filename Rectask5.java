package Pack1;

import java.util.Scanner;

public class Rectask5 {
    public static int recursion(int y) {
        if(y/10>=1) {
            int digit =y%10;
            int step=y/10;
            return digit + recursion(step);
        }
        else {
            return y;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int summ = 0;
        int d=0;
        System.out.print("Введите число: ");
        a = sc.nextInt();
        summ= recursion(a);
        System.out.print("Сумма цмфр числа = "+summ);

    }
}
