package Pack1;

public class Student implements Comparable<Student>{
    String Name = "IVAN";
    int endScore = 0;
    Student(/*int iDNumer,*/ String Name, int endScore){
        //this.iDNumber = iDNumer;
        this.Name = Name;
        this.endScore = endScore;
    }
    public int getendScore(){
        return endScore;
    }

    public void setEndScore(int endScore) {
        this.endScore = endScore;
    }

    public String toString() {
        String inf;
        inf = "Name: "+Name+" EndScore: "+endScore;
        return inf;
    }

    //@Override
    public int compareTo(Student o) {
        return endScore-o.getendScore();
    }

}
//sort?