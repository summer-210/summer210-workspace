package ls09.sortedList;

public interface List<T extends Comparable<T>> {

    // size
    // Returns the number of elements in the list.
    int size();

    // isEmpty
    // Returns true if list is empty, false otherwise.
    default boolean isEmpty() {
        return (size() == 0);
    }

    // clear
    // Empties the list (i.e., removes all elements).
    void clear();

    // contains
    // Returns true if this list contains the specified element.
    default boolean contains(T element) {
        return (find(element) != -1);
    }

    // find
    // Returns index of first occurrence of specified element
    // or -1 if not found.
    default int find(T element) {
        for (int i=0; i<size(); i++) {
            if (get(i).equals(element)) {
                return i;
            }
        }
        return -1;
    }

    // add
    // Adds element to list.
    // First form adds element at end of list.
    // Second form adds element at specified position shifting
    // other elements over as necessary. Specified position must
    // be in the range of 0 and size (inclusive).
    // Adding element at index size is the same as
    // adding element at the end of list.
    default void add(T element) {
        add(size(), element);
    }
    void add(int index, T element);

    // remove
    // Removes elements from list.
    // First form removes the first occurrence of the specified
    // element, returning true if found and false if not found.
    // If not found, list remains unchanged.
    // Second form removes element at specified position.
    // Position must be in the range of 0 to size-1. Returns
    // element at the specified position that was removed.
    default boolean remove(T element) {
        int index = find(element);
        if (index != -1) {
            remove(index);
            return true;
        }
        return false;
    }
    T remove(int index);

    // get
    // Returns the element at the specified position in this list.
    // Position must be in the range between 0 and size-1.
    T get(int index);

    // set
    // Replaces the element at the specified position in this list
    // with the specified element.
    // Specified position must be in range between 0 and size-1.
    // Returns element from list that was replaced.
    default T set(int index, T element) {
        if (index < 0 || index >= size()) {
            throw new RuntimeException("index is out of bounds");
        }
        T existing_element = remove(index);
        add(index, element);
        return existing_element;
    }
}
