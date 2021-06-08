package org.com.ds.recursion;

import java.util.List;

public class ProductSum {

    public static void main(String[] args) {

        List<Object> list1 = List.of(2, 3);
        List<Object> list2 = List.of(2, 4);
        List<Object> list3 = List.of(list1, 1);
        List<Object> array = List.of(1, 2, list3, 6, list2, 7);

        System.out.println(productSum(array, 1));
    }

    private static int productSum(List<Object> list, int depth){

        int sum = 0;
        for (Object object : list) {
            if(object instanceof List){
                sum = sum + productSum((List<Object>)object, depth + 1);
            }
            else{
                sum = sum + (int)object;
            }
        }
        return sum*depth;
    }
}