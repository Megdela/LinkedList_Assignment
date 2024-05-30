package com.dsa.singlyLinkedList;

public class Stack {
    Node head; // Reference to the top of the stack

    /**
     * Pushes the given data onto the top of the stack.
     *
     * @param data The data to be pushed onto the stack.
     */
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Removes and returns the top element from the stack.
     *
     * @return The top element of the stack, or -1 if the stack is empty.
     */
    public int pop() {
        if (head == null) {
            return -1; // Stack is empty
        }

        int data = head.data;
        head = head.next;
        return data;
    }

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return The top element of the stack, or -1 if the stack is empty.
     */
    public int peek() {
        if (head == null) {
            return -1; // Stack is empty
        }

        return head.data;
    }

    /**
     * Checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return head == null;
    }
}