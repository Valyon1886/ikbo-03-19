package ru.mirea.lab1;
import java.util.Scanner;
    public class start {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            int d = 0;
            int sum = 0;

            System.out.print("Введите размер массива: ");
            d = sc.nextInt();
            int[] a = new int[d];
            System.out.print("Введите элементы массива: ");
            for(int i = 0; i<d; i++) {
                a[i] = sc.nextInt();
                sum = sum + a[i];
            }
            System.out.print("Сумма элементов массива: ");
            System.out.print(sum+ "\n");
            System.out.print("Аргументы командной строки: ");
            for(int i = 0; i<a.length; i++) {
                System.out.print(a[i]+ " ");
            }
            double[] mass = new double[10];
            for(int i = 1; i<10; i++)
            {
                mass[i] = (double)1/i;
            }
            System.out.print("\n"+"Первые десять гармонических чисел: ");
            for(int i = 1; i<10; i++)
            {
                System.out.print(mass[i] + " ");
            }

            System.out.print("\n"+"Несортированный массив случайных чисел: ");
            int[] mass2 = new int[10];
            for(int i = 0; i<10; i++)
            {
                mass2[i] = (int)(Math.random()*100);
                System.out.print(mass2[i] + " ");
            }
            int buff;
            for(int j=0; j<10;j++)
            {
            for(int i = 0; i<9; i++)
            {
                if(mass2[i]>mass2[i+1])
                {
                    buff = mass2[i];
                    mass2[i] = mass2[i+1];
                    mass2[i+1] = buff;
                }
            }
            }
            System.out.print("\n"+"Отсортированный массив:  ");
            for(int i = 0; i<10; i++)
            {
                System.out.print(mass2[i] + " ");
            }

            System.out.print("\n"+"Введите число:  ");
            d = sc.nextInt();
            System.out.print("Факториал числа: " + fact(d));
            }
            public static int fact(int f) {
                int s1 = 1;
                for(int i = 1; i<=f;i++) {
                    s1 = s1 * i;
                }
                return s1;
            }
        }

