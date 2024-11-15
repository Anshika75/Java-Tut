package oops;

public class Reviews {
    private int id;
    private String review;
    private int rating;

    public Reviews(int id, String review, int rating) {
        super();
        this.id = id;
        this.review = review;
        this.rating = rating;
        
    }

    public String toString() {
        return id + " " + review + " - " + rating;
    }
}
