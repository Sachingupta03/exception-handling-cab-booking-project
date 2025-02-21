package com.sachin.service;

import com.sachin.exceptionHandline.CabException;
import com.sachin.model.Rating;

import java.util.ArrayList;
import java.util.List;

public class RatingService {
    private final List<Rating> ratings = new ArrayList<>();

    public void submitRating(Rating rating) throws CabException {
        if (rating == null || rating.getRating() < 1 || rating.getRating() > 5) {
            throw new CabException("Invalid rating! Rating must be between 1 and 5.");
        }
        ratings.add(rating);
        System.out.println("Rating submitted successfully.");
    }

    public void displayRatings() {
        if (ratings.isEmpty()) {
            System.out.println("No ratings available.");
            return;
        }
        for (Rating rating : ratings) {
            rating.displayRating();
        }
    }
}

