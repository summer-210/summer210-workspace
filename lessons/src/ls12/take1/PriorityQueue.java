package ls12.take1;

public interface PriorityQueue<V> {
    void enqueue(V value, int priority);
    V dequeue();
    V getMin();
    int size();
}
