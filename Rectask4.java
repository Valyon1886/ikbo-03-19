package Pack1;

import java.util.Scanner;

public class Rectask4 {
    public static int recursion(int len, int sum, int k, int s) {
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0); //чтоб с нуля не начиналось
        int res = 0;
        for (int i = c; i < 10; i++) {
            res = res+recursion(len + 1, sum + i, k, s);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0;
        int s = 0;
        int d = 0;
        System.out.print("Введите k и s: ");
        k = sc.nextInt();
        s = sc.nextInt();
        d = s;
        s = recursion(0, 0, k, s);
        System.out.print("Количество "+k+"-значных чисел, сумма цмфр которых = "+d+": " + s);
    }
}
