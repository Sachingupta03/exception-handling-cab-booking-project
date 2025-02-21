package com.sachin.service;

import com.sachin.exceptionHandline.CabException;
import com.sachin.model.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverService {
    private final List<Driver> drivers = new ArrayList<>();

    public void registerDrivers(Driver driver)throws CabException{
        if (driver.name.isEmpty() || driver.email.isEmpty() || driver.phone.isEmpty() || driver.address.isEmpty()){
            throw  new CabException("Driver details cannot be empty!");
        }
        driver.add(driver);
        System.out.println("Driver register successfully.");
    }
    public void displayDriver(){
        for (Driver driver : drivers){
            driver.displayDriver();
        }
    }
}
