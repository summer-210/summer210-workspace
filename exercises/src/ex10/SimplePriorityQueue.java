package ex10;

import java.util.ArrayList;
import java.util.List;

public class SimplePriorityQueue<V, P extends Comparable<P>> implements PriorityQueue<V, P> {
    private List<Prioritized<V, P>> elements;

    public SimplePriorityQueue() {
        elements = new ArrayList<>();
    }


    @Override
    public void enqueue(V value, P priority) {
        Prioritized<V,P> pv = new PrioritizedImpl(value, priority);
        elements.add(pv);
    }

    public V dequeue() {
        V min = getMin();
        elements.remove(min);
        return min;
    }

    @Override
    public V getMin() {
        Prioritized<V, P> min = elements.get(0);
        for(Prioritized<V,P> p: elements) {
            if(p.getPriority().compareTo(min.getPriority()) < 0)
                min = p;
        }
        return min.getValue();
    }

    public int size() {
        return elements.size();
    }

}
