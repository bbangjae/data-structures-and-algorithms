package tree;

public class MyBinarySearchTree<T extends Comparable<T>> {

    private TreeNode<T> root;
    private int size;

    public void insert(T element) {
        root = insertRecursive(root, element);
    }

    private TreeNode<T> insertRecursive(TreeNode<T> currentNode, T element) {
        if (currentNode == null) {
            size++;
            return new TreeNode<>(element);
        }

        int cmp = element.compareTo(currentNode.element);
        if (cmp < 0) {
            currentNode.left = insertRecursive(currentNode.left, element);
        }

        if (cmp > 0) {
            currentNode.right = insertRecursive(currentNode.right, element);
        }

        return currentNode;
    }

    public void delete(T element) {
        root = deleteRecursive(root, element);
    }

    private TreeNode<T> deleteRecursive(TreeNode<T> currentNode, T element) {
        if (currentNode == null) {
            return null;
        }

        int cmp = element.compareTo(currentNode.element);

        if (cmp < 0) {
            currentNode.left = deleteRecursive(currentNode.left, element);
        }

        if (cmp > 0) {
            currentNode.right = deleteRecursive(currentNode.right, element);
        }

        if (cmp == 0) {

            if (currentNode.left == null) {
                size--;
                return currentNode.right;

            }
            if (currentNode.right == null) {
                size--;
                return currentNode.left;
            }

            T smallestElement = findMin(currentNode.right);
            currentNode.element = smallestElement;
            currentNode.right = deleteRecursive(currentNode.right, smallestElement);
        }

        return currentNode;
    }

    public int size() {
        return size;
    }


    private T findMin(TreeNode<T> currentNode) {
        while (currentNode.left != null) {
            currentNode =  currentNode.left;
        }
        return currentNode.element;
    }

    public boolean contains(T element) {
        return containsRecursive(root, element);
    }

    private boolean containsRecursive(TreeNode<T> currentNode, T element) {
        if (currentNode == null) {
            return false;
        }
        if (currentNode.element.equals(element)) {
            return true;
        }

        if (element.compareTo(currentNode.element) < 0) {
            return containsRecursive(currentNode.left, element);
        }
        return containsRecursive(currentNode.right, element);
    }



    public void inOrderTraversal() {
        inOrderRecursive(root);
    }

    private void inOrderRecursive(TreeNode<T> currentNode) {
        if (currentNode == null) {
            return;
        }

        inOrderRecursive(currentNode.left);
        System.out.println(currentNode.element);
        inOrderRecursive(currentNode.right);
    }

    private static class TreeNode<T extends Comparable<T>> {
        TreeNode<T> left;
        TreeNode<T> right;
        T element;

        TreeNode(T element) {
            this.element = element;
        }
    }
}