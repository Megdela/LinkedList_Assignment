package com.dsa.singlyLinkedList;


public class LinkedList {
    Node head; // Head of the linked list

    /**
     * Inserts a node with the given data at the specified position in the singly linked list.
     *
     * @param data The data to be stored in the new node.
     * @param pos  The position at which the new node should be inserted (the index starts from 1).
     */
    public void insertAtPos(int data, int pos) {
        Node newNode = new Node(data);

        // If the position is 1, insert the node at the head of the list
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse the list to the (pos-1)th node
        Node current = head;
        for (int i = 0; i < pos - 2; i++) {
            if (current == null) {
                return;
            }
            current = current.next;
        }

        // If the list is shorter than the specified position, return
        if (current == null) {
            return;
        }

        // Insert the new node at the specified position
        newNode.next = current.next;
        current.next = newNode;
    }


    /**
     * Deletes the node at the specified position in the singly linked list.
     *
     * @param pos The position of the node to be deleted (1-based indexing).
     */
    public void deleteAtPosition(int pos) {
        if (head == null) {
            return; // If the list is empty, return
        }

        // If the position is 1, update the head to the next node
        if (pos == 1) {
            head = head.next;
            return;
        }

        // Traverse the list to the (pos-1)th node
        Node current = head;
        for (int i = 0; i < pos - 2; i++) {
            if (current == null || current.next == null) {
                return; // If the list is shorter than the specified position, return
            }
            current = current.next;
        }

        // If the list is shorter than the specified position, return
        if (current == null || current.next == null) {
            return;
        }

        // Delete the node at the specified position
        current.next = current.next.next;
    }

    /**
     * Deletes the node that occurs after the given node in the singly linked list.
     *
     * @param node The node after which the deletion should occur.
     */
    public void deleteAfterNode(Node node) {
        if (node == null || node.next == null) {
            return; // If the given node is null or the next node is null, return
        }

        // Store the node after the given node
        Node nextNode = node.next;

        // Update the next pointer of the given node to skip the next node
        node.next = nextNode.next;

        // Set the next pointer of the deleted node to null
        nextNode.next = null;
    }

    /**
     * Searches for a node with the specific value in the singly linked list.
     *
     * @param value The value to search for in the list.
     * @return The node with the given value, or null if not found.
     */
    public Node searchNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return current; // Return the node if the value is found
            }
            current = current.next;
        }
        return null; // Return null if the value is not found
    }

    /**
     * Searches for a node with the specific value in the singly linked list and returns its index.
     *
     * @param value The value to search for in the list.
     * @return The index of the node with the given value, or -1 if not found.
     */
    public int searchNodeInd(int value) {
        Node current = head;
        // System.out.println(head.data);
        int index = 0;
        while (current != null) {
            //   System.out.println(current.value);
            if (current.data == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1; // Return -1 if the value is not found

    }
    /**
     * Displays the elements of the singly linked list.
     */
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.print("The list contains: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}



