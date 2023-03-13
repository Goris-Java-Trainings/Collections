package org.example;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person x, Person y) {
        return (x.getAge() < y.getAge()) ? -1 : ((x == y) ? 0 : 1);
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
