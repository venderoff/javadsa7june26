package com.dsa.revision;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public static class Node{
        Node next;
        int value;
        Node(int value){
            this.value = value ;
            next = null ;
        }
    }



}
