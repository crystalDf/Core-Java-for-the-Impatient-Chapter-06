package ch06.ex04;

import java.util.ArrayList;

public class Table<K, V> {

    private ArrayList<Entry<K, V>> entryArrayList;

    public V getValue(K key) {

        for (Entry<K, V> entry : entryArrayList) {
            if (key.equals(entry.getKey())) {
                return entry.getValue();
            }
        }

        return null;
    }

    public void setValue(K key, V value) {

        for (Entry<K, V> entry : entryArrayList) {
            if (key.equals(entry.getKey())) {
                entry.setValue(value);
            }
        }
    }

    public void deleteKey(K key) {

        for (Entry<K, V> entry : entryArrayList) {
            if (key.equals(entry.getKey())) {
                entryArrayList.remove(entry);
            }
        }
    }
}
