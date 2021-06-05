package org.com.ds.sorting;

public class MergeSort {

    int[] array;
    int length;
    int[] tempMergeArr;

    public static void main(String[] args) {

        int[] inputArr = {48, 36, 13, 52, 19, 94, 21};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(inputArr);

    }

    private void sort(int[] inputArr) {

        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[inputArr.length];
        divideArray(0, length-1);
    }

    private void divideArray(int lowerIndex, int higherIndex) {

        if(lowerIndex < higherIndex){
            int middle = lowerIndex + (lowerIndex + higherIndex)/2;
            divideArray(lowerIndex, middle);
            divideArray(middle + 1, higherIndex);
            mergeArray(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeArray(int lowerIndex, int middle, int higherIndex){

        for (int i = lowerIndex; i < higherIndex; i++) {
            tempMergeArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while(i<=middle && j<=higherIndex){
            if(tempMergeArr[i] <= tempMergeArr[j]){
                array[k] = tempMergeArr[i];
                i++;
            }
            else{
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }

        while(i<=middle){
            array[k] = tempMergeArr[i];
            i++;
            k++;
        }
    }
}