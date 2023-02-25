package com.mgmetehan.Designpatternsexample.CreationalDesignPatterns.builder;

public class main {
    UserWithBuilder user1 = new UserWithBuilder.Builder("Metehan", "Gultekin")
            .age(23)
            .phone("1234567")
            .address("Fake address 1234")
            .build();

    UserWithBuilder user2 = new UserWithBuilder.Builder("John", "Doe").build();

    UserWithoutBuilder user3 = new UserWithoutBuilder("Metehan", "Gultekin", 23,
            "1234567", "Fake address 1234");

    // ! User4 hata veriyor cunku 2 parametreli constructor'i yok
    //UserWithoutBuilder user4 = new UserWithoutBuilder("John", "Doe");

    UserWithLombok user5 = UserWithLombok.builder()
            .firstName("Metehan")
            .lastName("Gultekin")
            .age(23)
            .phone("1234567")
            .address("Fake address 1234")
            .build();

    UserWithLombok user6 = UserWithLombok.builder()
            .firstName("John")
            .lastName("Doe")
            .build();
}
