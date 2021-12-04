package pgdp.collections;

public class LinkedQueue<T> implements Queue<T> {
    private List<T> current;
    private int count;

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public void enqueue(T obj) {
        if (isEmpty()) current = new List<>(obj, null);
        else {
            List<T> temp = current;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.insert(obj);
        }
        count = count + 1;
    }

    @Override
    public T dequeue() {
        if (current == null) return null;
        T result = current.getInfo();
        current = current.getNext();
        count = count - 1;
        return result;
         
    }
}
