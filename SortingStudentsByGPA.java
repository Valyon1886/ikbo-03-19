package Pack1;

public class SortingStudentsByGPA {
    public static void quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle].getendScore();

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i].getendScore() < opora) {
                i++;
            }

            while (array[j].getendScore() > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = array[i];
                array[i] = array[j];
                array[j]=temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    public static void main(String[] args) {
        Student[] school1 = new Student [6];
        school1[0] = new Student("Inokentiy1", 5);
        school1[1] = new Student("Inokentiy2", 14);
        school1[2] = new Student("Inokentiy3", 8);
        school1[3] = new Student("Inokentiy4", 0);
        school1[4] = new Student("Inokentiy5", 77);
        school1[5] = new Student("Inokentiy6", 3);
        quickSort(school1, 0,5);
        for(int i = 0; i < school1.length; i++){
            System.out.println(school1[i]);
        }
    }
//
}
/*class ScoreStudentComparator implements Comparator<Student>{

    public int compare(Student a, Student b){

        if(a.getendScore()> b.getendScore())
            return 1;
        else if(a.getendScore()< b.getendScore())
            return -1;
        else
            return 0;
    }
}*/
