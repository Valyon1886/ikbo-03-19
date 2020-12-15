package Pack1;

import java.util.Arrays;
import java.util.List;

public class Generic {
    private <T> List<T> convertToList(T[] array) {
        return Arrays.asList(array);
    }

    public void Test() {//Решил сюда засунуть эту функцию
        Object[] objectArray = {0, 0.5, "String", Boolean.TRUE};
        String[] stringArray = {"It's", "a", "string"};
        int[] intArray = {42, 728, 4555, 6, 0};
        System.out.println("Object: " + convertToList(objectArray));
        System.out.println("String: " + convertToList(stringArray));
        System.out.println("Integer: " + convertToList(Arrays.stream(intArray).boxed().toArray(Integer[]::new)));
    }
}
