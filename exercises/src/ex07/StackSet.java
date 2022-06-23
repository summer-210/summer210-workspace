package ex07;

/*
  Interface: The StackSet will provide this collection of operations:
*/

public interface StackSet<T> {
    public boolean push(T elt);
    public boolean pop();
    public T peek();
    public boolean contains(T elt);
    public int size();
    public int limit();
    public boolean isEmpty();
    public boolean isFull();
}


