package com.dsa.singlyLinkedList;



public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtPos(7,1);
        list.insertAtPos(8,2);
        list.insertAtPos(9,3);
        list.insertAtPos(10,4);

        list.display();

        System.out.println(list.searchNodeInd(8));
        System.out.println(list.searchNode(9));

        Node node=list.searchNode(8);

        list.deleteAfterNode(node);
        list.display();
        list.insertAtPos(11,4);
        list.display();

        // Create a new stack
        Stack stack = new Stack();

        // Push elements onto the stack
        stack.push(21);
        stack.push(31);
        stack.push(41);

        // Display the stack
        System.out.println("Stack elements: ");
        displayStack(stack);

        // Peek at the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element of the stack: " + topElement);

        // Pop elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Display the updated stack
        System.out.println("Stack elements after popping: ");
        displayStack(stack);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
            }
            // Helper method to display the elements of the stack
            public static void displayStack(Stack stack) {
                Stack tempStack = new Stack();

                while (!stack.isEmpty()) {
                    int element = stack.pop();
                    System.out.println(element);
                    tempStack.push(element);
                }

                while (!tempStack.isEmpty()) {
                    stack.push(tempStack.pop());
                }
            }
        }




