package com.example.employees;
import java.util.*;

public class ListOfEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        System.out.println("Enter employee names or exit :");
        while (true) {
            String name = sc.nextLine();
            if ("exit".equalsIgnoreCase(name)) {
                break;
            }
            employees.add(new Employee(name));
        }
        List<Employee> filteredEmployees = employees.stream()
                .filter(employee -> employee.getName().startsWith("A") || employee.getName().startsWith("a"))
                .toList();

        System.out.println("start with 'A':");
        for(Employee filterEmployee : filteredEmployees)
        {
            System.out.println(filterEmployee);
        }
    }
}

