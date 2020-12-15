package Task2;

public class ArrayQueue extends AbstractQueue {
    private final int CAPACITY = 100;
    private Object[] array;
    private int head;
    private int tail;

    public ArrayQueue() {
        array = new Object[CAPACITY];
        head = tail = 0;
    }

    private void ensureCapacity(int capacity) {
        if (capacity >= array.length) {
            Object[] temp = new Object[array.length << 1];
            int count = tail < head ? array.length - head : size;
            System.arraycopy(array, head, temp, 0, count);
            if (tail < head)
                System.arraycopy(array, 0, temp, count, tail);
            array = temp;
            head = 0;
            tail = size;
        }
    }

    protected void enqueueRealisation(Object element) {
        ensureCapacity(size + 1);
        array[tail] = element;
        tail = (tail + 1) % array.length;
    }

    public Object elementRealisation() {
        return array[head];
    }

    protected void dequeueRealisation() {
        array[head] = null;
        head = (head + 1) % array.length;
    }
}
