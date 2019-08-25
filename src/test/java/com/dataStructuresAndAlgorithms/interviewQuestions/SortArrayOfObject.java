package com.dataStructuresAndAlgorithms.interviewQuestions;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age; // ascending order sort
      //  return o.age - this.age; // descending order sort
    }
}
public class SortArrayOfObject {
    public static void main(String[] args) {
        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames.add("Jena");
        listOfNames.add("Leya");
        listOfNames.add("Hussein");
        System.out.println("Print before sort");
        print(listOfNames);
        Collections.sort(listOfNames);
        System.out.println("Print after sort");
        print(listOfNames);

        ArrayList<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(new Person("Jena", 3));
        listOfPeople.add(new Person("Laya", 1));
        listOfPeople.add(new Person("Hussein", 28));

        System.out.println("Before object sort");
        printObject(listOfPeople);
        Collections.sort(listOfPeople);
        System.out.println("After object sort");
        printObject(listOfPeople);
    }
    static void print(ArrayList<String> listOfNames) {
        for (String name : listOfNames) {
            System.out.println(name);
        }
    }

    static void printObject(ArrayList<Person> listOfPeople) {
        for (Person person : listOfPeople) {
            System.out.println(String.format("Name: %s, Age: %d", person.name, person.age));
        }
    }
}
