package com.dataStructuresAndAlgorithms.codeComplexity;

public class StackArray<T> {

    Object[] arrayStack;
    int size;
    int top;

    public StackArray(int size) {
        this.size = size;
        arrayStack = new Object[this.size];
        top = -1;
    }

    public void push(Object newItem){
        if (isFull()){
            System.out.println("stack is full");
            return;
        }
        top++;
        arrayStack[top] = newItem;
    }

    public Boolean isFull(){
        return(top == size - 1);
    }
    public Boolean isEmpty(){
        return(top == - 1);
    }

    public T pop(){
        if (isEmpty()){
            System.out.println("stack is empty");
            return null;
        }
        T item = (T) arrayStack[top];
        top--;
        return item;
    }
}
