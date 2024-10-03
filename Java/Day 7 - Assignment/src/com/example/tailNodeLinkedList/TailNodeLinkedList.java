package com.example.tailNodeLinkedList;

public class TailNodeLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        int[] dataValues = {141, 302, 164, 530, 474};
        for (int value : dataValues) {
            linkedList.insertAtTail(value);
        }
        linkedList.printList();
    }

}
