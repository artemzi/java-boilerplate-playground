package com.github.artemzi.application;

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

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
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
