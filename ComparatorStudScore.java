package Pack1;

public class ComparatorStudScore implements Comparator<Student>{
    public int compare(Student a, Student b){

        if(a.getendScore()> b.getendScore())
            return 1;
        else if(a.getendScore()< b.getendScore())
            return -1;
        else
            return 0;
    }

    public int compareInt(Student a, int b){

        if(a.getendScore()> b)
            return 1;
        else if(a.getendScore()< b)
            return -1;
        else
            return 0;
    }
}
