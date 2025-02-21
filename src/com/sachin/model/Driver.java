package com.sachin.model;

import javax.xml.stream.Location;

public class Driver extends User{
    private final String cabDetails;

   public Driver(int driverId,String name, String email, String phone, String address, String cabDetails){
       super(driverId,name,email,phone,address);
       this.cabDetails = cabDetails;

   }
  public void displayUser(){
       super.displayUser();
      System.out.println("Cab Details: " + cabDetails);

    }

    public void add(Driver driver) {
    }

    public void displayDriver() {
    }
}


