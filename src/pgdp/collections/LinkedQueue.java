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
        if(isEmpty()) current = new List<>(obj,null);
        else{
            List<T> temp = current;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.insert(obj);
        }
        count++;



    }


    /*List<T> newList = new List<T>(obj);
        if (this.first == null) {
            this.first = this.last = newList;
        }
        List<T> beforeFirst = this.first.getNext();
        beforeFirst = newList;
        this.first = newList;*/


    @Override
    public T dequeue() {
        // T result = first.getInfo();
       // if(last == first) last = null;
        if(current == null)return null;
        T result = current.getInfo();
        current = current.getNext();
        count--;
        return result;
    }
}
