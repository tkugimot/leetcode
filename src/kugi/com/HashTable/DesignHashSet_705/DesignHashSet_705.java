package kugi.com.HashTable.DesignHashSet_705;

import java.util.Arrays;

public class DesignHashSet_705 {
    public static void main(String args) {
        MyHashSet hashSet = new MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.contains(1);    // returns true
        hashSet.contains(3);    // returns false (not found)
        hashSet.add(2);
        hashSet.contains(2);    // returns true
        hashSet.remove(2);
        hashSet.contains(2);    // returns false (already removed)
    }
}

class MyHashSet {
    int[] array = new int[10000000];

    /** Initialize your data structure here. */
    public MyHashSet() {
        Arrays.fill(array, -1);
    }

    public void add(int key) {
        array[key] = key;
    }

    public void remove(int key) {
        array[key] = -1;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return array[key] != -1;
    }
}
