package ls16;

public interface Map<K extends Comparable<K>,V> {

    void put(K key, V value);
    V get(K key);
    void remove(K key);
    boolean contains(K key);

}