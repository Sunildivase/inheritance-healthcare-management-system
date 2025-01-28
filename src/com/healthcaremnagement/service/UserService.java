package com.healthcaremnagement.service;

import com.healthcaremnagement.model.Person;


public class UserService extends PersonService {

    public void createUser(){
        Person person = this.createPerson();
    }
    public void displayUser(){
        Person person = this.displayPerson();
    }
}
