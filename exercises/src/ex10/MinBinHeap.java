package ex10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class MinBinHeap  <V, P extends Comparable<P>> implements PriorityQueue<V, P> {

    private List<Prioritized<V,P>> _heap;
    /**
     * Constructor that creates an empty heap of Prioritized objects.
     */
    public MinBinHeap() {
        _heap = new ArrayList<>();
    }

    @Override
    public int size() {
        return _heap.size();
    }

    // TODO: enqueue
    @Override
    public void enqueue(V value, P priority) {

    }

    // TODO: dequeue
    @Override
    public V dequeue() {
        return null;
    }

    // TODO: getMin
    @Override
    public V getMin() {
        return null;
    }

    // Do not delete. We need this for grading!
    public Prioritized<V, P>[] getAsArray() {
        Prioritized<V,P>[] result = (Prioritized<V, P>[]) Array.newInstance(Prioritized.class, size());
        return _heap.toArray(result);
    }
}
