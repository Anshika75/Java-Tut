package oopslevel2;

public class Student extends Person {
    private String college;
    private int year;

    public Student(String name, String email, String phone, String college, int year) {
        super(name, email, phone);
        this.college = college;
        this.year = year;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return super.toString() + ", College: " + college + ", Year: " + year;
    }

}
