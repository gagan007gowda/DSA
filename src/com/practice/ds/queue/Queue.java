package com.practice.ds.queue;

public class Queue {
    QNode front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    private void enQueue(Integer value) {
        QNode temp = new QNode(value);
        if (rear == null) {
            rear = front = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
    }

    private void deQueue() {
        if (front == null) {
            System.out.println("There is no node to delete.");
        } else {
            this.front = front.next;
        }

        if (front ==null) {
            rear = null;
        }
    }

    private void printQueue() {
        if (rear == null) {
            System.out.println("This queue is empty.");
        } else {
            QNode temp = front;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.printQueue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        System.out.println("After insertion");
        queue.printQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        System.out.println("After deletion");
        queue.printQueue();

    }
}
