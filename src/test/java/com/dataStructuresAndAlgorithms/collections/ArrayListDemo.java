package com.dataStructuresAndAlgorithms.collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("developer");
        ar.add("tester");
        ar.add("manager");

        ar.remove(1);
        for (String st : ar) {
            System.out.println(st);
        }

        // array class
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Hussein",27));
        emp.add(new Employee("Jena",27));
        emp.add(new Employee("Layla",27));
        for (Employee employee : emp) {
            System.out.println(employee.name);
        }

    }

    static class Employee {
        String name;
        int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

    }
}
