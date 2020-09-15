package ru.mirea.pra2;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Author Rachel = new Author("Sutulaya_Sobaka", "Sobaka@gmail.com", 'M');
        System.out.print("Значения полей класса заданные поумолчанию: "+"\n");
        System.out.print(Rachel);
    }
}
