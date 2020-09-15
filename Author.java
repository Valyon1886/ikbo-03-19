package ru.mirea.pra2;

public class Author {
    private String name;
    private String email;
    private char gender;


    //Конструктор класса
    public Author(String n, String e, char g) {
        name =n;
        email =e;
        gender=g;
    }

    //Метод, возвращающий автора книги
    public String getName() {
        return name;
    }
    //Метод, возвращающий электронный адрес автора
    public String getEmail() {
        return email;
    }
    //Метод, возвращающий пол автора
    public char getGender() {
        return gender;
    }
    //Метод, задающий электронный адрес автора
    public void setEmail(String e){
    email = e;
    }

    @Override
    public String toString() {
        String inf;
        inf = name + " (" + gender + ") at " + email;
        return inf;
    }
}
