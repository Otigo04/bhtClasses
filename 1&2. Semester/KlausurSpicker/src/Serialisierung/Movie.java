package Serialisierung;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Movie {
    private String title;
    List<Integer> ratings = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> getRatings() {
        return ratings;
    }
    public Movie(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void addRating(int rating) {
        if (rating < 0 || rating > 5) {
            throw new IllegalArgumentException("Bewertung muss zwischen 1 und 5 liegen!");
        }
    }
    public double getAverageRating() {
        double average = 0;
        for (int rating : ratings) {
            average += rating;
        }
        double roundedAverage = Math.round(average * 100.0 / 100.0);
        return roundedAverage;

    }
}

interface MovieManager() {
    void
}
