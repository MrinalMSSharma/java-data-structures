package org.com.ds.sorting;

public class BubbleSort {

    public void sort (int[] array){

        int n = array.length;
        boolean isSwapped = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(isSwapped == false){
                break;
            }
        }
    }
}