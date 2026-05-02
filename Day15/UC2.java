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
    private int size = 20;
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

public class UC2 {
    public static void main(String[] args) {

        MyHashTable<String, Integer> map = new MyHashTable<>();

        String para = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        String[] words = para.toLowerCase().split(" ");

        for (String word : words) {
            Integer count = map.get(word);
            map.put(word, count == null ? 1 : count + 1);
        }

        System.out.println("UC2 Result:");
        map.display();
    }
}
