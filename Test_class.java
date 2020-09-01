package ru.mirea.lab1;
import ru.mirea.lab1.Dog;

import java.util.Scanner;

public class Test_class {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dog Rachel= new Dog("Sutulaya", "Sobaka", 42);
        System.out.print(Rachel);
    }
}
