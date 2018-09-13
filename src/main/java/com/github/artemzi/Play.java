package com.github.artemzi;

import com.github.artemzi.application.Person;
import com.github.artemzi.constructor.PersonGenerator;

import java.io.PrintStream;
import java.util.List;

public class Play {

    public static void main(String[] args) {
        List<Person> persons = PersonGenerator.fillWithValues(10);
        for (Person p : persons) {
            print(System.out, p.toString());
        }
    }

    public static void print(PrintStream out, String data) {
        out.println(data);
    }
}
