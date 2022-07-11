package ls16;

public class RBMap<K extends Comparable<K>, V> implements Map<K,V> {

    private class Node {
        K _key;
        V _value;
        boolean _is_black;
        Node _parent;
        Node _right;
        Node _left;

        Node(K key, V value, Node parent, Node left, Node right, boolean is_black) {
            _key = key;
            _value = value;
            _parent = parent;
            _left = left;
            _right = right;
            _is_black = is_black;
        }

        Node getSibling() {
            if (_parent == null) {
                return null;
            }

            if (isLeftChild()) {
                return _parent._right;
            }

            return _parent._left;
        }

        boolean isLeftChild() {
            if (_parent == null) {
                return false;
            }
            if (_parent._left == this) {
                return true;
            }
            return false;
        }

        Node rotateLeft() {
            if (_right == null) {
                throw new RuntimeException("Can't rotate left if right child is empty");
            }

            Node orig_parent = _parent;
            Node orig_right = _right;

            // First swing orig right child's left to be my new right
            _right = orig_right._left;
            if (_right != null) {
                _right._parent = this;
            }

            // Make myself the orig right's new left
            orig_right._left = this;
            _parent = orig_right;

            // Replace myself with orig right as my orig parent's child

            orig_right._parent = orig_parent;
            if (orig_parent._left == this) {
                orig_parent._left = orig_right;
            } else {
                orig_parent._right = orig_right;
            }

            // Return original right which now occupies the place
            // in the tree that I used to because of the rotation.
            return orig_right;
        }

        Node rotateRight() {
            if (_left == null) {
                throw new RuntimeException("Can't rotate right if left child is empty");
            }

            Node orig_parent = _parent;
            Node orig_left = _left;

            // First swing orig left child's right to be my new left
            _left = orig_left._right;
            if (_left != null) {
                _left._parent = this;
            }

            orig_left._right = this;
            _parent = orig_left;

            orig_left._parent = orig_parent;

            if (orig_parent._right == this) {
                orig_parent._right = orig_left;
            } else {
                orig_parent._left = orig_left;
            }

            return orig_left;
        }

    }

    private Node _root;

    public RBMap() {
        _root = null;
    }

    @Override
    public void put(K key, V value) {
        if (_root == null) {
            _root = new Node(key, value, null, null, null, true);
        } else {
            Node n = findNodeAt(key, _root);
            if (n != null) {
                n._value = value;
                return;
            } else {
                insertNodeAt(key, value, _root);
            }
        }
    }

    @Override
    public V get(K key) {
        Node n = findNodeAt(key, _root);
        if (n == null) {
            throw new RuntimeException("Key was not in map");
        }
        return n._value;
    }

    @Override
    public void remove(K key) {

    }

    @Override
    public boolean contains(K key) {
        return (findNodeAt(key, _root) != null);
    }


    private Node findNodeAt(K key, Node n) {
        if (n == null) {
            return null;
        }

        if (key.compareTo(n._key) == 0) {
            return n;
        }

        if (key.compareTo(n._key) < 0) {
            return findNodeAt(key, n._left);
        }

        return findNodeAt(key, n._right);
    }

    private void insertNodeAt(K key, V value, Node n) {
        if (n == null) {
            throw new RuntimeException("This should never happen");
        }

        if (n._key.compareTo(key) == 0) {
            throw new RuntimeException("This should never happen");
        }

        if (key.compareTo(n._key) < 0) {
            if (n._left != null) {
                insertNodeAt(key, value, n._left);
                return;
            }
            Node inserted_node = new Node(key, value, n, null, null, false);
            n._left = inserted_node;

            fixTreeAfterInsertion(inserted_node);

        } else {
            if (n._right != null) {
                insertNodeAt(key, value, n._right);
                return;
            }
            Node inserted_node = new Node(key, value, n, null, null, false);
            n._right = inserted_node;

            fixTreeAfterInsertion(inserted_node);
        }
    }

    private void fixTreeAfterInsertion(Node x) {
        if ((x._parent != null) && (x._parent._is_black)) {
            // Case A
            return;
        }

        if (x._parent == null) {
            // Case D
            x._is_black = true;
            return;
        }

        Node parent = x._parent;
        Node grandparent = parent._parent;
        Node pibling = parent.getSibling();

        if ((!parent._is_black) && (pibling != null) && (!pibling._is_black)) {
            // Case B
            grandparent._is_black = false;
            parent._is_black = true;
            pibling._is_black = true;
            fixTreeAfterInsertion(grandparent);
            return;
        }

        // Case C

        if (parent.isLeftChild()) {
            // Either LL or LR
            if (!x.isLeftChild()) {
                parent.rotateLeft();
            }
            // Now we are in LL for sure.
            grandparent = grandparent.rotateRight();
        } else {
            // Either RL or RR
            if (x.isLeftChild()) {
                parent.rotateRight();
            }
            // Now in  RR for sure
            grandparent = grandparent.rotateLeft();
        }
        grandparent._is_black = false;
        grandparent._left._is_black = true;
        grandparent._right._is_black = true;

        fixTreeAfterInsertion(grandparent);
    }

}
