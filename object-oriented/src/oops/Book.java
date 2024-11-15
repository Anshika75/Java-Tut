package oops;

import java.util.ArrayList;

public class Book {

    private int id;
    private String name;
    private String author;
    private ArrayList<Reviews> reviews;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public void addReview(Reviews review) {
        if (reviews == null) {
            this.reviews = new ArrayList<>();
        }
        this.reviews.add(review);
    }

    public String toString() {
        return String.format("Id: %s, Name: %s, Author: %s, Reviews: %s", id, name, author, reviews);
    }

}
