package org.com.ds.sorting;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {15, 9, 7, 13, 12, 16, 4, 18, 11};
        int length = arr.length;
    }

    private int partition(int[] arr, int low, int high){

        int pivot = arr[(low+high)/2];
        while(low <= high){
            while(arr[low] < pivot){
                low++;
            }
            while(arr[high] > pivot){
                high--;
            }
            if(low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                low++;
                high--;
            }
        }
        return low;
    }

    private void quickSortRecursion(int[] arr, int low, int high){

        int pivot = partition(arr, low, high);
        if(low < pivot-1){
            quickSortRecursion(arr, low, pivot-1);
        }
        if(pivot < high){
            quickSortRecursion(arr, pivot, high);
        }
    }
}