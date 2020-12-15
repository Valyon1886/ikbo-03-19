package Pack1;

import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[-\\w.]+@([A-z0-9][-A-z0-9]+(\\.|))+[A-z]{2,3}$");
        String[] email = {
                "samonchev001@gmail.com",
                "serie@nikolson",
                "@myway@",
                "fog@@@kok.ru",
                "Some string"
        };
        for (String i : email)
            System.out.println(pattern.matcher(i).matches() + ":\t" + i);
    }
}
