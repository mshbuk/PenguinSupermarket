package pgdp.collections;

public abstract class LinkedStack<T> implements Stack<T> {
    private  List<T> node;
   // private final T list;


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        //return list== null;
        return this.size() == 0;
    }

    @Override
    public void push(T obj) {


    }

    @Override
    public T pop() {
        if(this.isEmpty())return null;
        T result = node.getInfo();
        node = node.getNext();
        return result;
       //   T result = list.info;
       //  list = list.next;
       // return result;
    }
}
