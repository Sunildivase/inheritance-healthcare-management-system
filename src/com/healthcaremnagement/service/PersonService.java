package com.healthcaremnagement.service;

import com.healthcaremnagement.model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PersonService {

   private static final Scanner scanner = new Scanner(System.in);

    HashMap<String , Person> personHashMap = new HashMap<>();

    void printPerson(Person person){
        System.out.println(person);
    }

    public Person createPerson(){

        System.out.println("please enter id");
        int personId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter first Name");
        String firstName = scanner.nextLine();

        System.out.println("please enter last name");
        String lastName = scanner.nextLine();

        System.out.println("please enter age ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter gender");
        String gender = scanner.nextLine();

        System.out.println("please enter contactNo");
        String contactNo = scanner.nextLine();

        System.out.println("please enter alternateMobile");
        String alternateMobile = scanner.nextLine();

        System.out.println("please enter address");
        String address = scanner.nextLine();

        Person person = new Person();
        person.setPersonId(personId);
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);
        person.setGender(gender);
        person.setContactNo(contactNo);
        person.setAlternateNumber(alternateMobile);
        person.setAddress(address);
        personHashMap.put(String.valueOf(1),person);
        return person;
    }

    public Person displayPerson(){
        Set<Map.Entry<String,Person>> entrySet = personHashMap.entrySet();
        for(Map.Entry<String,Person> personEntry: entrySet){
            System.out.println("key: "+personEntry.getKey()+"value: "+personEntry.getValue());
        }
        return null;
    }
}
