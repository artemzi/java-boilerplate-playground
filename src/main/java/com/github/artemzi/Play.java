package com.github.artemzi;

import com.github.artemzi.person.Person;
import com.github.artemzi.person.PersonGenerator;

import java.io.PrintStream;
import java.util.List;

public class Play {

    public static void main(String[] args) {
        List<Person> persons = PersonGenerator.fillWithValues(10);
        for (Person p : persons) {
            print(System.out, p.toString());
        }
    }

    static void print(PrintStream out, String data) {
        out.println(data);
    }
}
