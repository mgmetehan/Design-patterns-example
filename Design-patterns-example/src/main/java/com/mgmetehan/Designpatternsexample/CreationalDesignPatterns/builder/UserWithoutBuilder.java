package com.mgmetehan.Designpatternsexample.CreationalDesignPatterns.builder;

public class UserWithoutBuilder {
    private String firstName; // required
    private String lastName; // required
    private int age; // optional
    private String phone; // optional
    private String address; // optional

    public UserWithoutBuilder(String firstName, String lastName, int age, String phone, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public UserWithoutBuilder() {
    }

/*    public UserWithoutBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserWithoutBuilder(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }*/
}
