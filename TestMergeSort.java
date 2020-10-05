package Pack1;

public class TestMergeSort {
    /*public static Student[] mergeArray(Student[] arrayA, Student[] arrayB) {

        Student[] arrayC = new Student[arrayA.length + arrayB.length];
        int posA = 0, posB = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (posA == arrayA.length) {
                arrayC[i] = arrayB[i - posB];
                posB++;
            } else if (posB == arrayB.length) {
                arrayC[i] = arrayA[i - posA];
                posA++;
            } else if (arrayA[i - posA].getendScore() < arrayB[i - posB].getendScore()) {
                arrayC[i] = arrayA[i - posA];
                posB++;
            } else {
                arrayC[i] = arrayB[i - posB];
                posA++;
            }
        }
        return arrayC;
    }*/

    public static Student[] mergesort(Student[] array1, Student[] array2, int len) {
        Student[] array3 = new Student[array1.length+array2.length];
        for(int i = 0; i<array3.length; i++){
            if(i<array1.length)
                array3[i]=array1[i];
            else
                array3[i]=array2[i-6];
        }
        Student[] array4 = new Student[array3.length];
        Student[] result = mergesortInner(array3, array4, 0, len);
        return result;
    }

    /**
     *
     buffer1 Массив для сортировки.
     buffer2 Буфер. Размер должен быть равен размеру buffer1.
     startIndex Начальный индекс в buffer1 для сортировки.
     endIndex Конечный индекс в buffer1 для сортировки.

     */
    public static Student[] mergesortInner(Student[] buffer1, Student[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // уже отсортирован.
        int middle = startIndex + (endIndex - startIndex) / 2;
        Student[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);
        Student[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        Student[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1].getendScore() < sorted2[index2].getendScore()
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static void main(String[] args) {
        Student[] school1 = new Student[6];
        school1[0] = new Student("Inokentiy1", 5);
        school1[1] = new Student("Inokentiy2", 14);
        school1[2] = new Student("Inokentiy3", 8);
        school1[3] = new Student("Inokentiy4", 0);
        school1[4] = new Student("Inokentiy5", 77);
        school1[5] = new Student("Inokentiy6", 3);

        Student[] school2 = new Student[6];
        school2[0] = new Student("Victor1", 7);
        school2[1] = new Student("Victor2", 53);
        school2[2] = new Student("Victor3", 11);
        school2[3] = new Student("Victor4", 55);
        school2[4] = new Student("Victor5", 10);
        school2[5] = new Student("Victor6", -1);

        Student[] s = mergesort(school1, school2, 12);
        for(int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }

    }
    }
