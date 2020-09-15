package ru.mirea.lab2;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book("Лоуренс Рис", "Освенцим", 2005);
        System.out.print("Значения полей класса заданные поумолчанию: "+"\n");
        System.out.print("Автор: "+b1.getAuthor()+"\n"+"Название "+ b1.getName()+"\n"+"Год издания: "+b1.getAge()+"\n");
        System.out.print("\n"+"Введите имя автора книги: ");
        b1.setAuthor(sc.next());
        System.out.print("\n"+"Введите название книги: ");
        b1.setName(sc.next());
        System.out.print("\n"+"Введите год издания книги: ");
        b1.setAge(sc.nextInt());
        System.out.print("\n"+"Данные изменены."+"\n");
        System.out.print("\n"+"Автор: "+b1.getAuthor()+"\n"+"Название "+ b1.getName()+"\n"+"Год издания: "+b1.getAge());


    }
}
