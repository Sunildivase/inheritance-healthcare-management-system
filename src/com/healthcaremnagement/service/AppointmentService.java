package com.healthcaremnagement.service;

import com.healthcaremnagement.model.Appointment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AppointmentService {

   private static final Scanner scanner = new Scanner(System.in);

   HashMap<String , Appointment> appointmentHashMap = new HashMap<>();

   void printAppointment(Appointment appointment){
       System.out.println(appointment);
   }

   public Appointment createAppointment(){
       System.out.println("please enter id");
       int appointmentId = Integer.parseInt(scanner.nextLine());

       System.out.println("please enter personId");
       int personId = Integer.parseInt(scanner.nextLine());

       System.out.println("please enter doctorId ");
       int doctorId = Integer.parseInt(scanner.nextLine());

       System.out.println("please enter hospitalId");
       int hospitalId = Integer.parseInt(scanner.nextLine());

       System.out.println("please enter departmentId");
       int deptId = Integer.parseInt(scanner.nextLine());

       Appointment appointment = new Appointment();
       appointment.setAppointmentId(appointmentId);
       appointment.setPersonId(personId);
       appointment.setDoctorId(doctorId);
       appointment.setHospitalId(hospitalId);
       appointment.setDeptId(deptId);
       appointmentHashMap.put(String.valueOf(1),appointment);
       return appointment;
   }

   public void displayAppointment(){
       Set<Map.Entry<String ,Appointment>> entrySet = appointmentHashMap.entrySet();
       for(Map.Entry<String ,Appointment> appointmentEntry : entrySet){
           System.out.println("key: "+appointmentEntry.getKey()+"value: "+appointmentEntry.getValue());
       }
   }
    public Appointment regularAppointment(){

        System.out.println("please enter appointmentId ");
        int appointmentId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter reason of appointment");
        String reasonOfAppointment = scanner.nextLine();

        System.out.println("please enter person Id");
        int personId = Integer.parseInt(scanner.nextLine());

        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentId);
        appointment.setReasonOfAppointment(reasonOfAppointment);
        appointment.setPersonId(personId);

        appointmentHashMap.put(String.valueOf(1),appointment);
        return appointment;
    }

    public Appointment doctorAppointment(){

        System.out.println("please enter appointment Id ");
        int appointmentId = Integer.parseInt(scanner.nextLine());

        System.out.println("please enter speciality");
        String speciality = scanner.nextLine();

        System.out.println("please enter personId");
        int personId = Integer.parseInt(scanner.nextLine());

        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentId);
        appointment.setSpeciality(speciality);
        appointment.setPersonId(personId);

        appointmentHashMap.put(String.valueOf(1),appointment);
        return appointment;
    }


}
