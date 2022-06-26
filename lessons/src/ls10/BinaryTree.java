package ls10;

public interface BinaryTree<T> {
    T getValue();
    void setValue(T value);
    BinaryTree<T> getLeft();
    BinaryTree<T> getRight();
    void setLeft(BinaryTree<T> left);
    void setRight(BinaryTree<T> right);
    int height();
    boolean contains(T value);
    boolean isEmpty();
}
