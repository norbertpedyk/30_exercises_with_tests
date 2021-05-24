package pl.pedyk.exercise2;

import java.util.LinkedHashMap;
import java.util.Map;

public class LruCache<K, V> {
    private Map<K, V> map;

    public LruCache(int cacheSize) {
        this.map = new LinkedHashMap<>(10, 0.75f, true) { //accessOrder must be true when it comes to recently used elements
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > cacheSize;
            }
        };
    }

    public V get(K key) {
        return map.get(key);
    }

    public void set(K key, V value) {
        map.put(key, value);
    }


}
