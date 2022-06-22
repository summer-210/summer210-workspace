package ls09.sortedList;

public interface SortedList<T> {
    // size
    // Returns the number of elements in the list.
    int size();

    // isEmpty
    // Returns true if list is empty, false otherwise.
    boolean isEmpty();

    // lookup
    // Given an element, returns index where element would
    // be found if inserted into the list. Result ranges from
    // 0 to size() inclusive.
    int look(T element);

    // find
    // Returns index of first occurrence of specified element
    // or -1 if not found.
    int find(T element);

    // insert
    // Inserts element to list at appropriate sorted position.
    void insert(T element);

    // remove
    // Removes element from list and returns true if found,
    // otherwise list is unchanged and returns false.
    boolean remove(T element);

    // get
    // Returns the element at the specified position in this list.
    // Position must be in the range between 0 and size-1.
    T get(int index);
}
