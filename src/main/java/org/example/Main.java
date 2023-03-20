package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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
        integers.add(16);

        for (Integer integer : integers) {

        }

        HashSet<Integer> integers1 = new HashSet<>(integers);

        new ArrayList<>(integers1);

        System.out.println(integers1);

//        System.out.println(integers);

        Collections.sort(integers);

        Set<Person> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(new Person(23, "cews"));
        integerTreeSet.add(new Person(32, "fvds"));
        integerTreeSet.add(new Person(54, "vsdvs"));
        integerTreeSet.add(new Person(2, "bv"));

        for (Person person : integerTreeSet) {

        }

//        System.out.println(integerTreeSet);

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(32);
        integerSet.add(0);
        integerSet.add(252);
        integerSet.add(423);
        integerSet.add(-414);
        integerSet.add(-1234);
        integerSet.add(252);


//        integerSet.remove(252);

//        System.out.println(integerSet);
        List<Person> people = new LinkedList<>();
        people.add(new Person(10, "Arman"));
        people.add(new Person(42, "Arman1"));
        people.add(new Person(53, "Arman2"));
        people.add(new Person(15, "Arman3"));
        people.add(new Person(10, "Arman4"));
        people.add(new Person(22, "Arman5"));

        Map<String, List<Person>> map = new HashMap<>();
        map.put("7a", people);
        map.put("7a", List.of(new Person(32, "Vazgen")));
        System.out.println(map.remove("7a"));


//        map.values()

//        System.out.println(map);

//        map.get("7a").add(new Person(32, "Vazgen"));
//        map.putIfAbsent("7b", List.of(new Person(32, "Vazgen")));


//        map.put("7a", List.of(new Person(32, "Vazgen")));

//        System.out.println(map);


        /*map.putIfAbsent("8d", List.of(new Person(10, "Arman"), new Person(42, "Arman1")));

        for (Map.Entry<String, List<Person>> stringListEntry : map.entrySet()) {
            map.get("7a");
        }*/

        // put, remove, get

//        System.out.println(integers);

//        System.out.println(integers.get(2));

        // LinkedList

        List<Person> numbers = new LinkedList<>();
        numbers.add(new Person(10, "Arman"));
        numbers.add(new Person(67, "Feliqs"));
        numbers.add(new Person(34, "Anna"));
        numbers.add(new Person(5, "Ani"));

        Iterator<Person> iterator = numbers.iterator();

        /*if(iterator.hasNext()) {
            iterator.next();
            if(iterator.hasNext()) {
                Person secondPerson = iterator.next();
                System.out.println(secondPerson);
            }
        }*/

//        System.out.println(numbers);

        numbers.sort(new PersonComparator());
//        System.out.println(numbers);

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