package org.com.ds.recursion;

public class TowerOfHanoiPuzzle {

    public static void main(String[] args) {

        towerOfHanoi(4, 'X', 'Y', 'Z');
    }

    private static void towerOfHanoi(int n, char from, char to, char aux){

        if(n == 1){
            System.out.println("Moving disk 1..");
        }
        else{
            towerOfHanoi(n-1, from, aux, to);
            System.out.println("Moving disk" + n + " from" + from + " to " + to + "rod..");
            towerOfHanoi(n-1, aux, to, from);
        }
    }
}