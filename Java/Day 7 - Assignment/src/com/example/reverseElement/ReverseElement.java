package com.example.reverseElement;

public class ReverseElement {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        int[] dataValues = {1, 2, 3, 4, 5};

        for (int value : dataValues) {
            linkedList.insertAtTail(value);
        }

        linkedList.reverse();

        linkedList.printList();
    }
}

