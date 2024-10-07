package com.example.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("No. of elements : ");
        int numberOfElements = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Enter element in String type " + (i + 1) + ": ");
            String element = scanner.nextLine();
            list.add(element);
        }

        System.out.println("Original Linked List: " + list);
        System.out.print("Remove element index (0 to " + (list.size() - 1) + "): ");
        int index = scanner.nextInt();

        if (index >= 0 && index < list.size()) {
            String removedElement = list.remove(index);
            System.out.println("Removed element: " + removedElement);
        } else {
            System.out.println("Give correct index between 0 and " + (list.size() - 1) + ".");
        }

        System.out.println("Updated Linked List: " + list);
        scanner.close();
    }
}
