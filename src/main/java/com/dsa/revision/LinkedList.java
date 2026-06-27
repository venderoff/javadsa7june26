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

    LinkedList(int value){
        System.out.println("Init  with  value " + value);
        Node newnode = new Node(value) ;
        if(length == 0){
            head = newnode ;
            tail = newnode ;
            length++ ;
        }else {
            append(value) ;
        }
    }

    void append(int value){
        System.out.println("Append function Called for "+ value);
        Node newnode = new Node(value) ;
        if(length == 0){
            head = newnode ;
            tail = newnode ;
            length++ ;
        }else {
            tail.next = newnode ;
            tail = newnode ;
            length++;
        }
    }

    void addFirst(int value){
        System.out.println("Adding first" + value);
        Node newnode = new Node(value);
        if(length == 0){
            head = newnode ;
            tail = newnode ;
            length++ ;
        }else {
            newnode.next = head ;
            head = newnode ;
            length++ ;
        }

    }
    void printDetails(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next ;
        }
        System.out.println("Head -->" + head.value);
        System.out.println("Tail-->" + tail.value);
        System.out.println("Length-->" + length);
    }

    void removeLast(){
        System.out.println("Remove Last-->" + tail.value);
        Node temp = head;
        Node prev = temp ;
        while(temp.next != null){
            prev = temp ;
            temp = temp.next ;
        }
        prev.next = null ;
        tail = prev ;
        length-- ;
    }
    void removeFirst(){
        System.out.println("Remove First" + head.value);
        Node temp = head ;
        head = head.next ;
        temp.next = null ;
        length-- ;
    }
    void middleOfNode(){
        System.out.println("Finding middle of Node");
        Node temp = head;
        Node slow = temp;
        Node fast = temp ;
        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }

        System.out.println("Middle is " + slow.value);

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);
        for(int i=2; i < 6; i++){
            ll.append(i);
        }
        ll.addFirst(0);
//        ll.removeLast();
        ll.removeFirst();
        ll.printDetails();
        ll.middleOfNode();
    }

}
