/*
	Dummy database - Data Model
		Users
			- ID
			- firstName
			- lastName
			- age
			- email
			- Gender
    DB Operations - DAO
        - Get All Users
            - to retrieve all users records from the database
        - Get User
            - to retrieve a specific user using their unique identifier(UUID)
        - Update User
            - to modify user information
        - Delete User
            - to remove a user from the database
        - Insert User
            - to add a new user to the database

*/
package com.thoniefernandez.learningspringboot.model;

import java.util.UUID;

public class User {
    private final UUID userUid;
    private final String firstName;
    private final String lastName;
    private final Gender gender;
    private final Integer age;
    private final String email;

    //Create constructor
    public User(UUID userUid, String firstName, String lastName, Gender gender, Integer age, String email){
        this.userUid = userUid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.email = email;
    }

    //Create getters
    public UUID getUserUid(){
        return userUid;
    }
    public String getFirstName(){
        return  firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Gender getGender(){
        return gender;
    }
    public Integer getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }

    @Override
    public String toString(){
        return "User{" +
                "userUid=" + userUid +
                "firstName ='" + firstName + '\'' +
                "lastName ='" + lastName + '\'' +
                "gender ='" + gender + '\'' +
                "age ='" + age + '\'' +
                "email ='" + email + '\'' +
                '}';
    }

    public enum Gender{
        MALE,
        FEMALE
    }

}
