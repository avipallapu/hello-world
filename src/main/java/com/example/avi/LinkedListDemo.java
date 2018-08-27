package com.example.avi;

public class LinkedListDemo{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtHead("five");
        ll.insertAtHead("four");
        ll.insertAtHead("three");
        ll.insertAtHead("two");
        ll.insertAtHead("one");


        Node res = appendToFront(ll.getHead(), 51);
        while (res != null) {
            System.out.println(res.getData());
            res = res.getNext();
        }
    }



    public static Node appendToFront(Node head, int n){
        if(head==null || head.getNext() == null) { return head; }
        Node first = head;
        Node second = head;
        Node third = head;

        int i = 0;
        while(i < n && first!=null){
            first = first.getNext();
            i++;
        }
        while(first!=null && first.getNext()!=null){
            second = second.getNext();
            first = first.getNext();
        }

        if(first!=null) {
            head = second.getNext();
            second.setNext(first.getNext());
            first.setNext(third);
        }

        return head;

    }
}
