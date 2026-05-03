package org.example;

public class LinkedList {
    private Node head;
    public LinkedList() {
        head = null;
    }

    public void append(Link link) {
        Node newNode = new Node(link);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);
    }

    public void traverse() {
    Node current = head;
    while (current != null) {
        System.out.println(current.getData().getMaterial());
        current = current.getNext();
        }
    }  
}
