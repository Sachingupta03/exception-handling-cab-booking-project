package com.sachin.model;

public class Rating {
    private final int ratingId;
    private final int rideId;
    private final int userId;
    private final int driverId;
    private final int rating;
    private final String review;

    public Rating(int ratingId, int rideId, int userId, int driverId, int rating, String review) {
        this.ratingId = ratingId;
        this.rideId = rideId;
        this.userId = userId;
        this.driverId = driverId;
        this.rating = rating;
        this.review = review;
    }

    public void displayRating() {
        System.out.println("Rating ID: " + ratingId + ", Ride ID: " + rideId + ", User ID: " + userId + ", Driver ID: " + driverId);
        System.out.println("Rating: " + rating + "/5, Review: " + review);
    }

    public int getRating() {
        return 0;
    }

}
