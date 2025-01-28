package com.healthcaremnagement.service;

import com.healthcaremnagement.model.Hospital;

import java.util.HashMap;
import java.util.Scanner;

public class HospitalService {

    private static final Scanner sc = new Scanner(System.in);

    HashMap<String , Hospital> hospitalHashMap = new HashMap<>();

    void printHospital(Hospital hospital){
        System.out.println(hospital);
    }

    public void createHospital(){

    }

    public void displayHospital(){
        
    }
}
