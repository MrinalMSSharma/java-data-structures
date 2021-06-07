package org.com.ds.sorting;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {38, 52, 9, 18, 6, 62, 13};
        int min = 0, temp = 0;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}