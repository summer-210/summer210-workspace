package ex08;

public class Main {
    public static void main(String[] args) {
    /*
    This is a basic example of how to create a BST and add values to it.
    You should add more examples and use this class to debug your code
    */
        BST<Integer> bst = new NonEmptyBST<Integer>(3);
        bst = bst.insert(8);
        bst = bst.insert(1);
        bst = bst.insert(9);
        bst = bst.insert(4);
        /* For this assignment, we didn't provide a toString method for you like we did with LinkedLists, so printing out the
        bst will give you something like `ex08.NonEmptyBST@5674cd4d`. To get more useful information, you might consider
        writing a helper toString method to give yourself a nice string representation of a BST, or making use of the
        different traversal methods to get information about what your tree looks like */
    }

}
