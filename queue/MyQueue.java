package queue;

public class MyQueue<T> {

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public void offer(T item) {
        Node<T> newNode = new Node<>(item);

        if (isEmpty()) {
            front = rear = newNode;
            size++;
            return;
        }

        rear.next = newNode;
        rear = newNode;
        size++;
    }

    public T poll() {
        if (isEmpty()) {
            return null;
        }

        T value = front.element;
        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }

        return value;
    }

    public T peek() {
        return isEmpty() ? null : front.element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        MyQueue.Node<T> current = front;
        while (current != null) {
            sb.append(current.element);
            if (current.next != null) sb.append(", ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    private static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }
}