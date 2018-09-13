package com.github.artemzi.person;

public class Person {
    private String fullName, company, position, address, city;
    private int age;

    public Person() {}

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    void setFullName(String fullName) {
        this.fullName = fullName;
    }

    void setCompany(String company) {
        this.company = company;
    }

    void setPosition(String position) {
        this.position = position;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setCity(String city) {
        this.city = city;
    }

    void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "\n\tfullName='" + fullName + '\'' +
                ",\n\tcompany='" + company + '\'' +
                ",\n\tposition='" + position + '\'' +
                ",\n\taddress='" + address + '\'' +
                ",\n\tcity='" + city + '\'' +
                ",\n\tage=" + age +
                "\n}";
    }
}
