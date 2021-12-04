package pgdp.collections;

public class DataStructureLink<T> {
    private Stack<T> A;
    private Queue<T> B;

    public DataStructureLink(Stack<T> stack, Queue<T> queue) {
        this.A = stack;
        this.B = queue;
    }

    public boolean moveNextFromAToB() {
        if(A.isEmpty()) return false;
        else {
            T object = A.pop();
            B.enqueue(object);
            return true;
        }
    }
    public void moveAllFromAToB() {
    while(!(A.isEmpty())) {
        T object = A.pop();
        B.enqueue(object);
    }
    }
}
