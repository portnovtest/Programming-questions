package com.dataStructuresAndAlgorithms.hash;

public class HashTableArray<T> {
    Entry[] arrayHash;
    int size;
    public HashTableArray(int size) {
        this.size = size;
        arrayHash = new Entry[size];
        for (int i = 0; i < size; i++)
            arrayHash[i] = new Entry();
    }
    int getHash(int key){
        return key%size;
    }
    public void put(int key, Object value){
        int hashIndex = getHash(key);
        Entry arrayValue = arrayHash[hashIndex];
        Entry newItem = new Entry(key, value);
        newItem.next = arrayValue.next;
        arrayValue.next = newItem;
    }
    public T get(int key){
        T value = null;
        int hashIndex =  getHash(key);
        Entry arrayValue = arrayHash[hashIndex];
        while (arrayValue !=null){
            if (arrayValue.getKey()==key){
                value = (T)arrayValue.getValue();
                break;
            }
            arrayValue = arrayValue.next;
        }
        return value;
    }
}
