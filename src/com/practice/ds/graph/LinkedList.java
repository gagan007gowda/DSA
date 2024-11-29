package com.practice.ds.graph;

public class LinkedList<T> {

    private class LinkListNode<E extends T> {
        E data;
        LinkListNode<E> next = null;

        LinkListNode(E data) {
            this.data = data;
            this.next = null;
        }
    }

    LinkListNode<T> head;

    public void insert(T data) {
        LinkListNode<T> tempNode = head;
        if (tempNode == null) {
            head = new LinkListNode<>(data);
            return;
        }
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = new LinkListNode<>(data);
    }

    public void displayLL() {
        LinkListNode<T> tempNode = head;
        if (head == null) {
            System.out.println("No element");
            return;
        }
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }
}
