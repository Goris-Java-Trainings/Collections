package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*int[] numbers = new int[4]; // array -> static data structure
        numbers[0] = 6;
        numbers[1] = 16;
        numbers[2] = -4;
        numbers[3] = 31;
        numbers[4] = 43;*/


        // dynamic data structure

        // ArrayList
        List<Integer> integers = new ArrayList<>();
        integers.add(16);
        integers.add(4321);
        integers.add(-4523);
        integers.add(75267);
        integers.add(0);

        System.out.println(integers);

        Collections.sort(integers);

        System.out.println(integers);

        System.out.println(integers.get(2));

        // LinkedList

        List<Person> numbers = new LinkedList<>();
        numbers.add(new Person(10, "Arman"));
        numbers.add(new Person(67, "Feliqs"));
        numbers.add(new Person(34, "Anna"));
        numbers.add(new Person(5, "Ani"));

        System.out.println(numbers);

        numbers.sort(new PersonComparator());
        System.out.println(numbers);

//
//        numbers.addAll(integers);
//
//        System.out.println(numbers);

//        numbers.add(43);

        /*int[] integers = {6, 16, -4, 31};
        System.out.println(integers);*/

//        System.out.println("Hello world!");
    }
}