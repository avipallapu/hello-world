package com.example.avi;

class LinkedList<T>{
    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insertAtHead(T data){
        Node newNode = new Node(data);

        newNode.setNext(this.head);
        this.head = newNode;
    }

    @java.lang.Override
    public java.lang.String toString() {
        StringBuilder s = new StringBuilder("LinkedList { ");
        Node cur = this.head;
        while(cur!=null) {
            s.append(cur.getData()+" -> ");
            cur = cur.getNext();
        }
        s.append("null }");

        return s.toString();
    }
}