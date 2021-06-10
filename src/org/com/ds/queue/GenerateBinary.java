package org.com.ds.queue;

import java.util.LinkedList;

public class GenerateBinary {

    public static void main(String[] args) {

        String[] binary = generateBinary(10);
    }

    private static String[] generateBinary(int size) {

        java.util.Queue<String> queue = new LinkedList<>();
        String[] result = new String[size];
        queue.offer("1");

        for (int i = 0; i < size; i++) {
            result[i] = queue.poll();
            String s1 = result[i] + "0";
            String s2 = result[i] + "1";
            queue.offer(s1);
            queue.offer(s2);
        }
        return result;
    }
}