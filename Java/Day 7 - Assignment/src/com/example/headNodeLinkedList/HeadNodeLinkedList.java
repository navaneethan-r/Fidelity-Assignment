package com.example.headNodeLinkedList;

public class HeadNodeLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        int[] dataValues = {383, 484, 392, 975, 321};
        for (int value : dataValues) {
            linkedList.insertAtHead(value);
        }
        linkedList.printList();
    }
}
