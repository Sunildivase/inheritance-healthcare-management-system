package com.healthcaremnagement.service;

import com.healthcaremnagement.model.Billing;

import java.util.HashMap;
import java.util.Scanner;

public class BillingService {

    private static final Scanner sc = new Scanner(System.in);

    HashMap<String , Billing> billingHashMap = new HashMap<>();

    void printBilling(Billing billing){
        System.out.println(billing);
    }
    public void createBilling(){
        
    }
    public void displayBilling(){

    }
}
