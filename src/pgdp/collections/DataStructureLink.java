package pgdp.collections;

public class DataStructureLink<T> {
    private Stack<T> stack;
    private Queue<T> queue;

    public DataStructureLink(Stack<T> stack, Queue<T> queue) {
        this.stack = stack;
        this.queue = queue;
    }

    public boolean moveNextFromAToB() {
        if(stack.isEmpty()) return false;
        else {
            T object = stack.pop();
            queue.enqueue(object);
            return true;
        }
    }
    public void moveAllFromAToB() {

    }

}
