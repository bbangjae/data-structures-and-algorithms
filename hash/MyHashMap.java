package hash;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;

    private LinkedList<Entry<K, V>>[] buckets;
    private final int capacity;
    private int size;

    public MyHashMap() {
        this(DEFAULT_CAPACITY);
    }

    public MyHashMap(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    public void put(K key, V value) {
        int index = hash(key);

        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        buckets[index].add(new Entry<>(key, value));
        size++;
    }

    public boolean remove(K key) {
        int index = hash(key);

        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                size--;
                return buckets[index].remove(entry);
            }
        }
        return false;
    }

    public V get(K key) {
        int index = hash(key);

        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        int index = hash(key);

        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    @Override
    public String toString() {
        return "MyHashTable {" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return key + " = " + value;
        }
    }
}
