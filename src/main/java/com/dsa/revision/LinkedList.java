package com.dsa.revision;

import org.springframework.beans.factory.xml.DelegatingEntityResolver;

public class LinkedList {
    private Node  head ;
    private Node tail ;
    private int length ;

    public static class Node{
        public Node next;
        public int value ;
        Node(int value){
            this.value = value ;
            this.next = null ;
        }
    }

    LinkedList(int value){
        Node newnode = new Node(value);
        if(length == 0){
            head = newnode ;
            tail = newnode ;
            length++ ;
        }
        else {
            append(value);
        }
    }

    void append(int value){
        System.out.println("Append Method called-->" + value);
        Node newnode = new Node(value) ;
        tail.next = newnode ;
        tail = newnode ;
        length++ ;
    }

    void addFirst(int value){
        System.out.println("Add First" + value);
        Node  newnode = new Node(value) ;
        newnode.next = head ;
        head = newnode ;
        length++;
    }

    void printDetails(){
        Node temp = head ;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next ;
        }
        System.out.println("Head is -->" + head.value);
        System.out.println("Tail is -->" + tail.value);
        System.out.println("Length is -->" + length);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1) ;
        for (int i=2; i < 6 ; i++){
            ll.append(i);
        }
        ll.addFirst(0);
        ll.printDetails();
    }

}
