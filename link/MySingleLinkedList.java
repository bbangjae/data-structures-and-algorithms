package link;

public class MySingleLinkedList<T> {

    private int size;
    private Node<T> first;

    public void add(T item) {
        Node<T> newNode = new Node<>(item);

        if (first == null) {
            first = newNode;
            size++;
            return;
        }

        Node<T> lastNode = getLastNode();
        lastNode.next = newNode;

        size++;
    }

    public void add(int index, T item) {
        checkPositionIndex(index);
        Node<T> newNode = new Node<>(item);

        if (index == 0) {
            newNode.next = first;
            first = newNode;

            size++;
            return;
        }

        Node<T> prevNode = getNode(index - 1);
        newNode.next = prevNode.next;
        prevNode.next = newNode;

        size++;
    }

    public T get(int index) {
        checkElementIndex(index);
        return getNode(index).element;
    }

    public void set(int index, T item) {
        checkElementIndex(index);
        Node<T> node = getNode(index);
        node.element = item;
    }

    public void remove(int index) {
        checkElementIndex(index);
        if (index == 0) {
            Node<T> removedNode = first;
            first = first.next;
            removedNode.next = null;
            removedNode.element = null;

            size--;
            return;
        }

        Node<T> prevNode = getNode(index - 1);
        Node<T> removeNode = prevNode.next;
        prevNode.next = removeNode.next;
        removeNode.element = null;
        removeNode.next = null;

        size--;
    }

    public int size() {
        return size;
    }

    private Node<T> getNode(int index) {
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    private Node<T> getLastNode() {
        Node<T> current = first;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    private void checkElementIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private void checkPositionIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    private static class Node<T> {
        T element;
        Node<T> next;

        Node(T element) {
            this.element = element;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<T> current = this;
            sb.append("[");
            while (current != null) {
                sb.append(current.element);
                if (current.next != null) {
                    sb.append("->");
                }
                current = current.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }

    @Override
    public String toString() {
        return "MyLinkList{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
