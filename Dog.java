package ru.mirea.lab1;
import java.util.Scanner;

public class Dog {
    Scanner sc = new Scanner(System.in);
    private String name;
    private String type;
    private int weight;

    public Dog(String name1, String type1, int weight1){
        name = name1;
        type = type1;
        weight = weight1;
    };
    @Override
    public String toString(){
        String inf;
        inf = "Кличка" + " "+ name + " "+ "Порода" + " "+type + " " + "Вес"+" "+weight;
        return inf;
    };
}
