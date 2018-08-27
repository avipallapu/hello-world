package com.example.avi;

class Node<T>{
    private T data;
    private Node next;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Node node = (Node) object;
        return java.util.Objects.equals(data, node.data);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}