package Day15;

import java.util.*;

class MyMapNode<K, V> {
    K key;
    V value;

    MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashTable<K, V> {
    private int size = 10;
    private LinkedList<MyMapNode<K, V>>[] buckets;

    @SuppressWarnings("unchecked")
    public MyHashTable() {
        buckets = new LinkedList[size];
        for (int i = 0; i < size; i++)
            buckets[i] = new LinkedList<>();
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
            if (node.key.equals(key))
                return node.value;
        }

        return null;
    }

    public void display() {
        for (LinkedList<MyMapNode<K, V>> bucket : buckets) {
            for (MyMapNode<K, V> node : bucket) {
                System.out.println(node.key + " : " + node.value);
            }
        }
    }
}

public class UC1 {
    public static void main(String[] args) {

        MyHashTable<String, Integer> map = new MyHashTable<>();

        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {
            Integer count = map.get(word);
            map.put(word, count == null ? 1 : count + 1);
        }

        System.out.println("UC1 Result:");
        map.display();
    }
}