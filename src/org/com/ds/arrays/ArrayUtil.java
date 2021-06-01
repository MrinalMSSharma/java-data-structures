package org.com.ds.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayUtil {

    public int[] removeEven(int[] arr) {
        int oddElements = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddElements++;
            }
        }

        int[] result = new int[oddElements];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static void reverse(int[] numbers, int start, int end) {
        while(start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }

    static int secondLargest(int[] input) {
        int firstLargest, secondLargest;
        //Checking first two elements of input array
        if(input[0] > input[1]) {
            //If first element is greater than second element
            firstLargest = input[0];
            secondLargest = input[1];
        }
        else {
            //If second element is greater than first element
            firstLargest = input[1];
            secondLargest = input[0];
        }

        //Checking remaining elements of input array

        for (int i = 2; i < input.length; i++) {
            if(input[i] > firstLargest) {
                //If element at 'i' is greater than 'firstLargest'
                secondLargest = firstLargest;
                firstLargest = input[i];
            }
            else if (input[i] < firstLargest && input[i] > secondLargest) {
                //If element at 'i' is smaller than 'firstLargest' and greater than 'secondLargest'
                secondLargest = input[i];
            }
        }
        return secondLargest;
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) {
            if(!map.containsKey(target - numbers[i])) {
                map.put(numbers[i], i);
            } else {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
        }
        throw new IllegalArgumentException("Two numbers not found");
    }
}