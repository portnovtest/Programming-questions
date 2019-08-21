package com.dataStructuresAndAlgorithms.codeComplexity;

import java.util.Arrays;

public class StackDynamicArray<T> {
    Object[] arrayStack;
    int size;
    int top;

    public StackDynamicArray(int size) {
        this.size = size;
        arrayStack = new Object[this.size];
        top = -1;
    }

    public void push(Object newItem){
        ensureCapacity(top + 2);
        top++;
        arrayStack[top] = newItem;
    }

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = getSize();
        if (minCapacity > oldCapacity){
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            arrayStack = Arrays.copyOf(arrayStack, newCapacity);
        }
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
    public int getSize(){
        return arrayStack.length;
    }
}
