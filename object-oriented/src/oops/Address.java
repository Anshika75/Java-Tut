package oops;

public class Address {
    private String line1;
    private String city;
    private String zip;

    public Address(String line1, String city, String zip) {
        super(); // this is optional, means it will call the constructor of the parent class (Object class) 
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString() {
        return line1 + ", " + city + " - " + zip;
    }
}
