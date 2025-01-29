package com.healthcaremnagement;

import com.healthcaremnagement.service.*;

import java.util.Scanner;

public class InheritanceHealthcareDemo {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option=0;
        do {
            System.out.println("-------healthcare-management-system--------------");
            System.out.println("1.create Person");
            System.out.println("2.create User");
            System.out.println("3.create Doctor");
            System.out.println("4.create hospital");
            System.out.println("5.create department");
            System.out.println("6.create appointment");
            System.out.println("7.create prescription");
            System.out.println("8.create billing");
            System.out.println("please select the option");
            option = Integer.parseInt(scanner.nextLine());

            switch (option){
                case 1:
                    System.out.println("person register form");
                    PersonService peronService = new PersonService();
                    peronService.createPerson();
                    peronService.displayPerson();
                    System.out.println("person registered successfully");
                    break;

                case 2:
                    System.out.println("user register form");
                    UserService userService =new UserService();
                    userService.createUser();
                    userService.displayUser();
                    System.out.println("patient registered successfully");
                    break;

                case 3:
                    DoctorService doctorService = new DoctorService();
                    doctorService.createDoctor();
                    doctorService.displayDoctor();
                    System.out.println("doctor registered successfully");
                    break;

                case 4:
                    HospitalService hospitalService = new HospitalService();
                    hospitalService.createHospital();
                    hospitalService.displayHospital();
                    System.out.println("hospital registered successfully");
                    break;

                case 5:
                    DepartmentService departmentService = new DepartmentService();
                    departmentService.createDepartment();
                    departmentService.displayDepartment();
                    System.out.println("department created successfully");
                    break;

                case 6:
                    AppointmentService appointmentService = new AppointmentService();
                    appointmentService.createAppointment();
                    appointmentService.displayAppointment();
                    System.out.println("appointment booked successfully");
                    break;

                case 7:
                    PrescriptionService prescriptionService = new PrescriptionService();
                    prescriptionService.createPrescription();
                    prescriptionService.displayPrescription();
                    System.out.println("prescription generated successfully");
                    break;

                case 8:
                    BillingService billingService = new BillingService();
                    billingService.createBilling();
                    billingService.displayBilling();
                    System.out.println("bill generated successfully");
                    break;

                default:
                    System.out.println("please enter valid input");
                    break;

            }
        }while(option!=0);{
            System.out.println("thank you...!!!");
        }

    }
}
