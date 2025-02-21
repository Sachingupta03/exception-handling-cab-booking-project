package com.sachin.controllers;

import com.sachin.exceptionHandline.CabException;
import com.sachin.model.Ride;
import com.sachin.service.RideService;

public class RideController {
    private final RideService rideService = new RideService();

    public void bookRide(int rideId, int userId, int driverId, String pickup, String dropoff, double fare, String status) {
        try {
            Ride ride = new Ride(rideId, userId, driverId, pickup, dropoff, fare, status);
            rideService.bookRide(ride);
        } catch (CabException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Ride booking successfully completed.");
        }
    }

    public void updateRideStatus(int rideId, String newStatus) {
        try {
            rideService.updateRideStatus(rideId, newStatus);
        } catch (CabException e) {
            System.out.println("Exception: " + e.getMessage());

        }
    }
}