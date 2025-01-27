package com.healthcaremnagement.service;

import com.healthcaremnagement.model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserService extends PersonService {

    public void createUser(){
        Person person = this.createPerson();
    }
    public void displayUser(){
        Person person = this.displayPerson();
    }
}
