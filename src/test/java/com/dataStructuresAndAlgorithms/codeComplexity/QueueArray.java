package com.dataStructuresAndAlgorithms.codeComplexity;

public class QueueArray<T> {
    Object[] arrayQueue;
    int rear;
    int front;
    int size;

    public QueueArray(int size) {
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
        if (isFull()){
            System.out.println("queue is full");
            return;
        }
        rear++;
        arrayQueue[rear] = newItem;
        if (front==-1)
            front=0;
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
