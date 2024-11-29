package com.practice.ds.linkedlist;

public class LinkedList {
    Node head;


    private void addNodeFront(Integer data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    private void addNodeEnd(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node nodeForLoop = head;
        while (nodeForLoop.next != null) {
            nodeForLoop = nodeForLoop.next;
        }
        nodeForLoop.next = newNode;
    }

    private void printLL() {
        Node nodeForLoop = head;
        while (nodeForLoop != null) {
            System.out.println(nodeForLoop.data);
            nodeForLoop = nodeForLoop.next;
        }
    }

    private void addAfterNode(Node atNode){
/*        while(head!=null && head){

        }*/
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNodeFront(10);
        linkedList.addNodeFront(20);
        linkedList.addNodeEnd(30);
        linkedList.addNodeEnd(40);
        linkedList.printLL();
    }
}
