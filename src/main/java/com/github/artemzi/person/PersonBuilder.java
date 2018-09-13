package com.github.artemzi.person;

class PersonBuilder {
    private Person person;

    PersonBuilder() {
        person = new Person();
    }

    PersonBuilder setFullName(String fullName) {
        person.setFullName(fullName);
        return this;
    }

    PersonBuilder setCompany(String company) {
        person.setCompany(company);
        return this;
    }

    PersonBuilder setPosition(String position) {
        person.setPosition(position);
        return this;
    }

    PersonBuilder setAddress(String address) {
        person.setAddress(address);
        return this;
    }

    PersonBuilder setCity(String city) {
        person.setCity(city);
        return this;
    }

    PersonBuilder setAge(int age) {
        person.setAge(age);
        return this;
    }

    Person build() {
        return person;
    }
}
