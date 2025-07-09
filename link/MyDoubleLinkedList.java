package link;

public class MyDoubleLinkedList<T> {

    private int size;
    private Node<T> first;
    private Node<T> last;

    public void add(T item) {
        Node<T> newNode = new Node<>(item);

        if (first == null) {
            first = last = newNode;
            size++;
            return;
        }

        last.next = newNode;
        newNode.prev = last;
        last = newNode;
        size++;
    }

    public void add(int index, T item) {
        checkPositionIndex(index);
        Node<T> newNode = new Node<>(item);

        if (index == 0) {
            if (first == null) {
                first = last = newNode;
                size++;
                return;
            }

            first.prev = newNode;
            newNode.next = first;
            first = newNode;
            size++;
            return;
        }

        if (index == size) {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
            size++;
            return;
        }

        Node<T> current = getNode(index);
        Node<T> prevNode = current.prev;

        newNode.next = prevNode.next;
        newNode.prev = prevNode;
        prevNode.next = newNode;
        current.prev = newNode;

        size++;
    }

    public T get(int index) {
        checkElementIndex(index);
        return getNode(index).element;
    }

    public void set(int index, T item) {
        checkElementIndex(index);
        getNode(index).element = item;
    }

    public void remove(int index) {
        checkElementIndex(index);
        Node<T> removeNode = getNode(index);

        if (index == 0) {
            first = first.next;
            if (first != null) {
                first.prev = null;
            }
            if (size == 1) {
                last = null;
            }
            clearNode(removeNode);
            size--;
            return;
        }

        if (removeNode == last) {
            last = removeNode.prev;
            last.next = null;
            clearNode(removeNode);
            size--;
            return;
        }

        removeNode.prev.next = removeNode.next;
        removeNode.next.prev = removeNode.prev;
        clearNode(removeNode);
        size--;
    }

    public int size() {
        return size;
    }

    private Node<T> getNode(int index) {
        Node<T> current;

        if (index < size / 2) {
            current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }

        current = last;
        for (int i = size - 1; i > index; i--) {
            current = current.prev;
        }
        return current;
    }

    private void clearNode(Node<T> clearNode) {
        clearNode.prev = null;
        clearNode.next = null;
        clearNode.element = null;
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
        Node<T> prev;

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