package ls10;

public class BinaryTreeImpl<T> implements BinaryTree<T> {

    private T _value;
    private BinaryTree<T> _left;
    private BinaryTree<T> _right;

    public BinaryTreeImpl(T value, BinaryTree<T> left, BinaryTree<T> right) {
        _value = value;
        _left = left;
        _right = right;
    }


    @Override
    public T getValue() {
        return _value;
    }

    @Override
    public void setValue(T value) {
        _value = value;
    }

    @Override
    public BinaryTree<T> getLeft() {
        return _left;
    }

    @Override
    public BinaryTree<T> getRight() {
        return _right;
    }

    @Override
    public void setLeft(BinaryTree<T> left) {
        _left = left;
    }

    @Override
    public void setRight(BinaryTree<T> right) {
        _right = right;
    }

    @Override
    public int height() {
        // Done in class
        return 0;
    }

    @Override
    public boolean contains(T value) {
        // Done in class
        return false;
    }

    @Override
    public boolean isEmpty() {
        // Done in class
        return false;
    }
}
