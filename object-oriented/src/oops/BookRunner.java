package oops;

public class BookRunner {
    
        public static void main(String[] args) {
            Book book = new Book(1, "Object Oriented Programming", "Anshika");
            book.addReview(new Reviews(101, "Great Book", 5));
            book.addReview(new Reviews(102, "Awesome", 5));
            System.out.println(book);
        }
}
