package com.practice.ds.stack;

public class Stack {
    static final int MAX = 10;

    static int TOP = -1;

    int[] stack = new int[MAX];

    private boolean isEmpty() {
        return TOP <= -1;
    }

    private void push(int element) {
        if (TOP > MAX) {
            System.out.println("Stack overflow.");
        } else {
            stack[++TOP] = element;
        }
    }

    private int pop() {
        if (TOP < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stack[TOP--];
        }
    }

    private void print() {
        for (int i = 0; i <= TOP; i++) {
            System.out.print(stack[i] + " ");
        }
    }

    private int peek() {
        if (TOP < 0) {
            System.out.println("No elements.");
            return -1;
        } else {
            return stack[TOP];
        }
    }

    public static void main(String[] ars) {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Deleted " + stack.pop());
        System.out.println("The top element is: " + stack.peek());
        stack.print();
    }
}
