package Day15;

import java.util.*;

// Node for key-value pair
class MyMapNode<K, V> {
    K key;
    V value;

    MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

// Custom HashTable
class MyHashTable<K, V> {
    private int size = 20; // increased size
    private LinkedList<MyMapNode<K, V>>[] buckets;

    @SuppressWarnings("unchecked")
    public MyHashTable() {
        buckets = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put(K key, V value) {
        int index = getIndex(key);

        for (MyMapNode<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        buckets[index].add(new MyMapNode<>(key, value));
    }

    public V get(K key) {
        int index = getIndex(key);

        for (MyMapNode<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }

        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        buckets[index].removeIf(node -> node.key.equals(key));
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            if (!buckets[i].isEmpty()) {
                System.out.print("Bucket " + i + ": ");
                for (MyMapNode<K, V> node : buckets[i]) {
                    System.out.print("(" + node.key + ":" + node.value + ") ");
                }
                System.out.println();
            }
        }
    }
}

// MAIN
public class HashTableUC {
    public static void main(String[] args) {

        // -------- UC1 --------
        MyHashTable<String, Integer> map = new MyHashTable<>();

        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {
            Integer count = map.get(word);   // FIXED
            map.put(word, count == null ? 1 : count + 1);
        }

        System.out.println("UC1 Word Frequency:");
        map.display();

        // -------- UC2 --------
        MyHashTable<String, Integer> map2 = new MyHashTable<>();

        String para = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        String[] words2 = para.toLowerCase().split(" ");

        for (String word : words2) {
            Integer count = map2.get(word);
            map2.put(word, count == null ? 1 : count + 1);
        }

        System.out.println("\nUC2 Word Frequency:");
        map2.display();

        // -------- UC3 --------
        map2.remove("avoidable");

        System.out.println("\nUC3 After Removing 'avoidable':");
        map2.display();
    }
}