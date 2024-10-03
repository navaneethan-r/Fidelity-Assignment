package com.example.insertNode;

public class InsertNode {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtPosition(13, 0);
        linkedList.insertAtPosition(7, 1);

        linkedList.insertAtPosition(16, 0);

        linkedList.insertAtPosition(1, 2);

        linkedList.printList();
    }
}
