package hash;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashTable<E> {

    private static final int DEFAULT_CAPACITY = 16;
    private final int capacity;
    private LinkedList<E>[] buckets;
    private int size;

    public MyHashTable() {
        this(DEFAULT_CAPACITY);
    }

    public MyHashTable(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    public void add(E element) {
        int index = hash(element);

        if (contains(element)) {
            return;
        }

        buckets[index].add(element);
        size++;
    }

    public void remove(E element) {
        int index = hash(element);

        if (buckets[index].remove(element)) {
            size--;
        }
    }

    public boolean contains(E element) {
        int index = hash(element);
        return buckets[index].contains(element);
    }

    @SuppressWarnings("unchecked")
    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(E element) {
        return Math.abs(element.hashCode()) % capacity;
    }

    @Override
    public String toString() {
        return "MyHashTable{" +
                "capacity=" + capacity +
                ", buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                '}';
    }
}