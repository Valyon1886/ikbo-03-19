package Pack1;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        Student[] school1 = new Student [6];
        school1[0] = new Student("Inokentiy1", 5);
        school1[1] = new Student("Inokentiy2", 14);
        school1[2] = new Student("Inokentiy3", 8);
        school1[3] = new Student("Inokentiy4", 0);
        school1[4] = new Student("Inokentiy5", 77);
        school1[5] = new Student("Inokentiy6", 3);

        Student[] school2 = new Student [6];
        school2[0] = new Student("Victor1", 7);
        school2[1] = new Student("Victor2", 53);
        school2[2] = new Student("Victor3", 11);
        school2[3] = new Student("Victor4", 55);
        school2[4] = new Student("Victor5", 10);
        school2[5] = new Student("Victor6", -1);

        int[] iDNumber = new int[]{10, 6, 1, 9, 2, 8};
        for(int i = 0; i < iDNumber.length; i++){
        System.out.println(iDNumber[i]);
        }
        for (int left = 0; left < iDNumber.length; left++) {
            int value = iDNumber[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < iDNumber[i]) {
                    iDNumber[i + 1] = iDNumber[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            iDNumber[i + 1] = value;
        }
        for(int i = 0; i < iDNumber.length; i++){
            System.out.println(iDNumber[i]);
        }
    }
}
