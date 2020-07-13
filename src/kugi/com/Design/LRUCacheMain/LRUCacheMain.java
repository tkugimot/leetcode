package kugi.com.Design.LRUCacheMain;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheMain {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);

        cache.put(2, 1);
        cache.put(1, 1);
        cache.put(2, 3);
        cache.put(4, 1);
        System.out.println(cache.get(1));       // returns 1
        System.out.println(cache.get(2));
    }
}

class LRUCache {
    private int capacity;
    private Map<Integer, Integer> map;


    LRUCache(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            int value = map.get(key);
            map.remove(key);
            map.put(key, value);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (!map.containsKey(key) && map.size() == capacity) {
            map.remove(map.entrySet().iterator().next().getKey());
        }

        if (map.containsKey(key)) {
            map.remove(key);
            map.put(key, value);
        }
        map.put(key, value);
    }
}


