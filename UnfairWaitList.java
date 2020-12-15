package Pack1;

public class UnfairWaitList<E> extends WaitList<E> {
    public UnfairWaitList() {
        super();
    }

    @Override
    public E remove() {
        return super.remove();
    }

    public void moveToBack(E element) {
        super.add(element);
    }
}
