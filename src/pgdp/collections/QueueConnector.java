package pgdp.collections;

public class QueueConnector<T> implements DataStructureConnector<T> {
    private Queue<T> queue = new LinkedQueue<>();

    public QueueConnector(Queue<T> queue) {
        this.queue = queue;
    }

    @Override
    public boolean hasNextElement() {
        if(!(queue.isEmpty())) return true;
        return false;
    }

    @Override
    public void addElement(T obj) {
    queue.enqueue(obj);
    }

    @Override
    public T removeNextElement() {
        if(!hasNextElement())return null;
        else return queue.dequeue();

    }
}
