package pgdp.collections;

public class LinkedStack<T> implements Stack<T> {
    private List<T> node;
    private int count;
    // private final T list;


    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        //return list== null;
        return this.size() == 0;
    }

    @Override
    public void push(T obj) {
        node = new List<>(obj, node);
        count++;
    }

    @Override
    public T pop() {
        if (this.isEmpty()) return null;
        T top = node.getInfo();
        node = node.getNext();
        count--;
        return top;
        //addElement(T obj); return obj;

        //   T result = list.info;
        //  list = list.next;
        // return result;
    }
}
