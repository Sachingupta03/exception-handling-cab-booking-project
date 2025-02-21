package com.sachin.controllers;

import com.sachin.exceptionHandline.CabException;
import com.sachin.model.Driver;
import com.sachin.service.DriverService;

public class DriverController {
    private final DriverService driverService = new DriverService();

    public  void registerDriver(int id, String name, String email, String phone, String address, String cabDetails){
        try {
            Driver driver = new Driver(id,name,email,phone,address,cabDetails);
            driverService.registerDrivers(driver);
        }catch (CabException e){
            System.out.println("Exception: "+ e.getMessage());
        }finally {
            System.out.println("Driver register successfully completed.");

        }
    }
    public void displayDrivers(){
        driverService.displayDriver();
    }

    public void registerDriver(int i, String santosh, String mail, String number, String bhagoli) {
    }
}
