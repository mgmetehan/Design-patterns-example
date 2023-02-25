package com.mgmetehan.Designpatternsexample.CreationalDesignPatterns.builder;

import lombok.Builder;

@Builder
public class UserWithLombok {
    private String firstName; // required
    private String lastName; // required
    private int age; // optional
    private String phone; // optional
    private String address; // optional
}
