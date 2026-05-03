package org.example;

public class Node {
    private Link data;
    private Node next;
    public Node(Link data) {
        this.data = data;
        this.next = null;
    }

    public Link getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
