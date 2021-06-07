package org.com.ds.arrays;

public class MaxSumSubArray {

    public static void main(String[] args) {

        int[] arr = {4, -2, -3, 4, -1, -2, 1, 5, -3};
        int sum_so_far = Integer.MIN_VALUE;
        int sum_ending_here = 0;
        int start=0, end=0, s=0;

        for (int i = 0; i < arr.length; i++) {
            sum_ending_here = sum_ending_here + arr[i];
            if(sum_so_far < sum_ending_here){
                sum_so_far = sum_ending_here;
                start = s;
                end = i;
            }
            if(sum_ending_here < 0){
                sum_ending_here = 0;
                s = i+1;
            }
        }
    }
}