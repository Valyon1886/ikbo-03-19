package ru.mirea.lab2;

public class Book {
    //Свойства, поля класса
    private String author;
    private String name;
    private int age;


    //Конструктор класса
    public Book(String a1, String n, int a2) {
        author=a1;
        name=n;
        age=a2;
    }

    //Метод, возвращающий автора книги
    public String getAuthor() {
        return author;
    }
    //Метод, возвращающий название книги
    public String getName() {
        return name;
    }
    //Метод, возвращающий год издания книги
    public int getAge() {
        return age;
    }
    //Метод, устанавливающий автора книги
    public void setAuthor(String a1) {
        author=a1;
    }
    //Метод, устанавливающий название книги
    public void setName(String n) {
        name=n;
    }
    //Метод, устанавливающий год издания книги
    public void setAge(int a2) {
        age=a2;
    }
}
