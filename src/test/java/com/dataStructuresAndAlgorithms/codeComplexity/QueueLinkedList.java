package com.dataStructuresAndAlgorithms.codeComplexity;

public class QueueLinkedList<T> {
    NodeD rear;
    NodeD front;
    public QueueLinkedList() {
        rear = null;
        front = null;
    }
    public void queue(Object value) {
        NodeD newNode = new NodeD(value, null, null);
        if (rear == null || front == null) {
            rear = newNode;
            front = newNode;
        } else {
            newNode.next = null;
            newNode.previous = rear;
            rear.next = newNode;
            rear = newNode;
        }
    }
    public T dequeue(){
        if (rear == null || front == null) {
            System.out.println("queue is empty");
            return null;
        }
        T value = (T)front.value;
        front = front.next;
        if (front != null)
        front.previous = null;
        return value;
    }
}
