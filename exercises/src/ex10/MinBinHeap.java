package ex10;

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
}
