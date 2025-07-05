package array;

import java.util.Arrays;

public class MyArrayList<E> {

    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int initialCapacity) {
        this.size = 0;
        this.elements = new Object[initialCapacity];
    }

    public int size() {
        return this.size;
    }

    public void add(E item) {
        if (this.size == this.elements.length) {
            ensureCapacity();
        }

        this.elements[this.size] = item;
        this.size++;
    }

    public void add(int index, E item) {
        checkPositionIndex(index, true);

        if (this.size == this.elements.length) {
            ensureCapacity();
        }

        shiftRight(index);
        this.elements[index] = item;
        this.size++;
    }

    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) this.elements[index];
    }

    void remove(int index) {
        checkPositionIndex(index, false);

        this.size--;
        shiftLeft(index);
        this.elements[this.size] = null;
    }


    public void set(E item, int index) {
        checkPositionIndex(index, false);
        this.elements[index] = item;
    }

    public int indexOf(E item) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E item) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elements = " + Arrays.toString(this.elements) +
                ", size = " + this.size +
                '}';
    }

    private void ensureCapacity() {
        if (this.size == this.elements.length) {
            this.elements = Arrays.copyOf(this.elements, this.elements.length * 2);
        }
    }

    private void shiftLeft(int index) {
        for (int i = index; i < this.size; i++) {
            this.elements[i] = this.elements[i + 1];
        }
    }

    private void shiftRight(int index) {
        for (int i = this.size; i > index; i--) {
            this.elements[i] = this.elements[i - 1];
        }
    }

    private void checkPositionIndex (int index, boolean allowEnd) {
        int upper = allowEnd ? this.size : this.size - 1;

        if (index < 0 || index > upper) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
    }
}