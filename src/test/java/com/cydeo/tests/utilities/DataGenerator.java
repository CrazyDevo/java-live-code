package com.cydeo.tests.utilities;

import com.github.javafaker.Faker;

public class DataGenerator {

    public static String getEmail(){

        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        return email;
    }

}
