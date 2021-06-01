package org.com.ds.circularsinglelinklist;

import java.util.NoSuchElementException;

public class CircularSingleLinkList {

    private ListNode last;
    private int length;

    public CircularSingleLinkList(){

        last = null;
        length = 0;
    }

    private class ListNode{

        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public int length(){

        return length;
    }

    public boolean isEmpty(){

        return length == 0;
    }

    public void createCircularList(){

        ListNode first = new ListNode(5);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(15);
        ListNode fourth = new ListNode(20);

        first.next= second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

    public void display(){

        if(null == last){
            return;
        }
        int count = 0;
        ListNode first = last.next;
        while(first != last){
            System.out.println(first.data);
            first = first.next;
            count++;
        }
        System.out.println(first.data);
        System.out.println(count);
    }

    public void insertAtFirst(){

        ListNode temp = new ListNode(25);
        if(last == null){
            last = temp;
        }
        else{
            last.next = temp.next;
        }
        last.next = temp;
        length++;
    }

    public void insertLast(int data){

        ListNode temp = new ListNode(data);
        if(null == last){
            last = temp;
            last.next = last;
        }
        else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public ListNode removeFirst(){

        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        if(last.next == last){
            last = null;
        }
        else{
            last.next = temp.next;
        }
        temp.next = null;
        length--;

        return temp;
    }

    public ListNode removeLast() {
        if(isEmpty()) {
            throw new NoSuchElementException("Circular Singly Linked List is already empty");
        }

        ListNode temp = last;
        if(last.next == last) {
            last = null;
        } else {
            ListNode secondLast = last;
            while(secondLast.next != last) {
                secondLast = secondLast.next;
            }
            secondLast.next = last.next;
            last = secondLast;
        }
        temp.next = null;
        length--;
        return temp;
    }
}