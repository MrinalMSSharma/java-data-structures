package org.com.ds.priorityqueue;

public class MaxPQ {

    private Integer[] heap;
    private int size;

    public MaxPQ(int capacity){

        heap = new Integer[capacity + 1];
        size = 0;
    }

    public Boolean isEmpty(){

        return size == 0;
    }

    public int length(){

        return this.size;
    }

    public void insert(int data){

        if(size == heap.length - 1){
            resize(2 * heap.length);
        }
        size++;
        heap[size] = data;
        swim(size);
    }

    private void swim(int size) {

        while(size>1&& heap[size/2]<heap[size]){
            int temp = heap[size];
            heap[size] = heap[size/2];
            heap[size/2] = temp;
            size = size/2;
        }
    }

    private void resize(int capacity) {

        Integer[] temp = new Integer[capacity];
        for (int i=0; i<heap.length; i++){
            temp[i] = heap[i];
        }
        heap = temp;
        temp = null;
    }
}