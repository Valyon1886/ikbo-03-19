package Pack1;

import java.util.Arrays;

// 2 задание
public class GenArray<T>{
    private T[] data;
    private int currentSize;

    public GenArray(int size){
        if (size < 0)
            throw new IndexOutOfBoundsException();
        data = (T[]) new Object[size];
        currentSize = 0;
    }

    public void add(T item) {
        try {
            data[currentSize++] = item;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ooops!");
        }
    }

    @Override
    public String toString() {
        return "GenArray{" +
                "data=" + Arrays.toString(data) +
                ", currentSize=" + currentSize +
                '}';
    }
}
