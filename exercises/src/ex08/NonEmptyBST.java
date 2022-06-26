package ex08;

public class NonEmptyBST<T extends Comparable<T>> implements BST<T> {
    private T _element;
    private BST<T> _left;
    private BST<T> _right;

    public NonEmptyBST(T element) {

        _left = new EmptyBST<T>();
        _right = new EmptyBST<T>();
        _element = element;
    }

    // TODO: size
    @Override
    public int size() {
        return -1;
    }

    // TODO: findMin
    @Override
    public T findMin() {
        return null;
    }

    // TODO: findMax
    @Override
    public T findMax() {
        return null;
    }

    // TODO: contains
    @Override
    public boolean contains(T element) {
        return false;
    }

    // TODO: insert
    @Override
    public BST<T> insert(T element) {
        return null;
    }

    // TODO: remove
    @Override
    public BST<T> remove(T element) {
        return null;
    }

    // TODO: printInOrderTraversal
    @Override
    public void printInOrderTraversal() {
    }

    // TODO: printPreOrderTraversal
    @Override
    public void printPreOrderTraversal() {
    }

    // TODO: printPostOrderTraversal
    @Override
    public void printPostOrderTraversal() {
    }

    // TODO: printBreadthFirstTraversal
    @Override
    public void printBreadthFirstTraversal() {
    }

    @Override
    public int getHeight() {
        return Math.max(_left.getHeight(), _right.getHeight())+1;
    }


    @Override
    public BST<T> getLeft() {
        return _left;
    }

    @Override
    public BST<T> getRight() {
        return _right;
    }

    @Override
    public T getElement() {
        return _element;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

}
