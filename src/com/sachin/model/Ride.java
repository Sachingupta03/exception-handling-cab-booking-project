package com.sachin.model;

public class Ride {
    private final int rideId;
    private final int userId;
    private final int driverId;
    private final String pickupLocation;
    private final String dropoffLocation;
    private final double fare;
    private String status;

    public Ride(int rideId, int userId, int driverId, String pickupLocation, String dropoffLocation, double fare, String status) {
        this.rideId = rideId;
        this.userId = userId;
        this.driverId = driverId;
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
        this.fare = fare;
        this.status = status;
    }

    public void displayRide() {
        System.out.println("Ride ID: " + rideId + ", User ID: " + userId + ", Driver ID: " + driverId);
        System.out.println("Pickup: " + pickupLocation + ", Dropoff: " + dropoffLocation);
        System.out.println("Fare: " + fare + ", Status: " + status);
    }

    public void setStatus(String Status) {
        status = Status;
    }

    public int getRideId() {
        return 0;
    }

}
