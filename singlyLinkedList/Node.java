package com.dsa.singlyLinkedList;

/**
 * The Node class represents a node in a singly linked list.
 * Each node contains a data value and a reference to the next node in the list.
 */
public class Node {
    int data;      // The value stored in the node.
    Node next;     // Reference to the next node in the linked list.

    /**
     * Constructs a new Node with the given data value.
     * The next reference is initially set to null.
     *
     * @param data the value to be stored in the node
     */
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}