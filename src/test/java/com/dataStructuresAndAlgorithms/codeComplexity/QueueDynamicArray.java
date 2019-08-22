package com.dataStructuresAndAlgorithms.codeComplexity;

import java.util.Arrays;

public class QueueDynamicArray<T> {
    Object[] arrayQueue;
    int rear;
    int front;
    int size;

    public QueueDynamicArray(int size) {
        this.size = size;
        arrayQueue = new Object[this.size];
        front = -1;
        rear = -1;
    }

    public Boolean isFull(){
        return (rear==size-1);
    }
    public Boolean isEmpty(){
        return (front== -1 || front > rear);
    }

    public void queue(Object newItem){
        ensureCapacity(rear + 2);
        rear++;
        arrayQueue[rear] = newItem;
        if (front==-1)
            front=0;
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = getSize();
        if (minCapacity > oldCapacity){
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            arrayQueue = Arrays.copyOf(arrayQueue, newCapacity);
        }
    }

    public int getSize(){
        return arrayQueue.length;
    }

    public T dequeue(){
        if (isEmpty()){
            System.out.println("queue is empty");
            return null;
        }
        T objectOut = (T) arrayQueue[front];
        front++;
        return objectOut;
    }
}
