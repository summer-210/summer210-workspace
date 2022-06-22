package ls09.sortedList;

public class ArrayList<T> implements List<T> {
    private Object[] _elements;
    private int _size;

    private static final int INIT_ARRAY_SIZE = 10;

    public ArrayList() {
        _elements = new Object[INIT_ARRAY_SIZE];
        _size = 0;
    }

    @Override
    public int size() {
        return _size;
    }

    @Override
    public void clear() {
        _elements = new Object[INIT_ARRAY_SIZE];
        _size = 0;
    }

    @Override
    public void add(int index, T element) {
        if (index < 0 || index > size()) {
            throw new RuntimeException("index out of bounds");
        }

        if (size() == _elements.length) {
            // Need to resize the elements array to make room.
            resize_elements_array();
        }

        for (int i = size(); i > index; i--) {
            _elements[i] = _elements[i-1];
        }
        _elements[index] = element;
        _size++;
    }


    @Override
    public T remove(int index) {
        if (index < 0 || index > size()) {
            throw new RuntimeException("index out of bounds");
        }

        T element_removed = get(index);

        for (int i=index; i<size()-1; i++) {
            _elements[i] = _elements[i+1];
        }
        _size--;
        return element_removed;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > size()) {
            throw new RuntimeException("index out of bounds");
        }

        return (T) _elements[index];
    }

    private void resize_elements_array() {
        Object[] resized_elements_array = new Object[_elements.length*2];
        for (int i=0; i<_elements.length; i++) {
            resized_elements_array[i] = _elements[i];
        }
        _elements = resized_elements_array;
    }
}
