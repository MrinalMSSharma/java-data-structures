package org.com.ds.sorting;

public class HeapSort {

    public static void main(String[] args) {

        int[] arr = {22, 13, 17, 11, 10, 14, 12};
    }

    private void sort(int[] arr){

        int length = arr.length;
        for (int i = length/2 - 1; i >= 0; i--) {
            heapify(arr, length, i);
        }

        for (int i = length-1; i >= 0 ; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i){

        int largest = i;
        int li = 2*largest + 1;
        int ri = 2*largest + 2;

        if(li<n && arr[li]>arr[largest]){
            largest = li;
        }
        if(ri<n && arr[ri]>arr[largest]){
            largest = ri;
        }
        if(i != largest){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
}