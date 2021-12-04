package pgdp.collections;

public class StackConnector<T> implements DataStructureConnector<T> {
    private Stack<T> stack = new LinkedStack<>();

    public StackConnector(Stack<T> stack) {
        this.stack = stack;
    }

    @Override
    public boolean hasNextElement() {
       if (!(stack.isEmpty())) return true;
        return false;
    }

    @Override
    public void addElement(T obj) {
    stack.push(obj);
    }

    @Override
    public T removeNextElement() {
        if(!(hasNextElement())) return null;
        else return stack.pop();
    }
}
