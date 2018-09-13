package com.github.artemzi.person;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PersonGenerator {
    private static List<Person> persons = new ArrayList<>();

    public static List<Person> fillWithValues(int size) {
        PersonBuilder builder;
        Faker faker = new Faker();
        for (int i = 0; i < size; i++) {
            builder = new PersonBuilder();
            persons.add(builder.setFullName(faker.name().fullName())
                                .setAge(ThreadLocalRandom.current().nextInt(16, 63))
                                .setAddress(faker.address().streetAddress())
                                .setCity(faker.address().cityName())
                                .setCompany(faker.company().name())
                                .setPosition(faker.company().profession())
                                .build());
        }
        return persons;
    }
}
