package com.github.artemzi;

import com.github.artemzi.person.Person;
import com.github.artemzi.person.PersonGenerator;

import java.io.PrintStream;
import java.util.List;

public class Play {

    public static void main(String[] args) {
        List<Person> persons = PersonGenerator.fillWithValues(100);
        for (Person p : persons) {
            print(System.out, p.toString());
        } // TODO: try to play with search / sort by different field. Storing object etc.
    }

    static void print(PrintStream out, String data) {
        out.println(data);
    }
}
