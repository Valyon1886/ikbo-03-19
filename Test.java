package Pack1;
import java.util.ArrayList;
//я добавил недостающие методы
public class Test {
    public static void main(String[] args) {
        ArrayList<String> states1 = new ArrayList<String>();
        ArrayList<String> states2 = new ArrayList<String>(20);
// добавим в список ряд элементов
        states1.add("Германия");
        states1.add("Франция");
        states1.add("Великобритания");
        states1.add("Испания");
        states1.add("Германия");
        states1.add(1, "Италия"); // добавляем элемент по индексу 1

        states2.addAll(0, states1); //добавляю все элементы из states1 в stetes2
        System.out.println(states2.indexOf("Германия")); //первый индекс элемента = "Германия"


        System.out.println(states1.get(1));// получаем 2-й объект
        states1.set(1, "Дания"); // установка нового значения для 2-го объекта
        System.out.printf("В списке %d элементов \n", states1.size());
        for(String state : states1){
            System.out.println(state);
        }
        if(states1.contains("Германия")){
            System.out.println("Список содержит государство Германия");
        }

// удалим несколько объектов
        states1.remove("Германия");
        states1.remove(0);
        Object[] countries = states1.toArray();
        for(Object country : countries){
            System.out.println(country);
        }
    }
}

