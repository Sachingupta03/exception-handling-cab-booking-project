package com.sachin.service;

import com.sachin.exceptionHandline.CabException;
import com.sachin.model.Ride;

import java.util.ArrayList;
import java.util.List;

public class RideService {
    private final List<Ride> rides = new ArrayList<>();

    public void bookRide(Ride ride) throws CabException {
        if (ride == null) {
            throw new CabException("Ride details cannot be null!");
        }
        rides.add(ride);
        System.out.println("Ride booked successfully.");
    }

    public void updateRideStatus(int rideId, String newStatus) throws CabException {
        for (Ride ride : rides) {
            if (rideId == ride.getRideId()) {
                ride.setStatus(newStatus);
                System.out.println("Ride status updated to: " + newStatus);
                return;
            }
        }
        throw new CabException("Ride ID not found!");
    }

    public void displayRides() {
        if (rides.isEmpty()) {
            System.out.println("No rides available.");
            return;
        }
        for (Ride ride : rides) {
            ride.displayRide();
        }

    }
}
