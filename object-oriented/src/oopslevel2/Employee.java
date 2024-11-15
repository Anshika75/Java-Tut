package oopslevel2;

import java.math.BigDecimal;

public class Employee extends Person {
    private String title;
    private String employer;
    private char employeeGrade; // means A, B, C, D, E
    private BigDecimal salary;

    public Employee(String name, String email, String phone, String title, String employer, char employeeGrade, BigDecimal salary) {
        super(name, email, phone);
        this.title = title;
        this.employer = employer;
        this.employeeGrade = employeeGrade;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public char getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(char employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + ", Title: " + title + ", Employer: " + employer + ", Employee Grade: " + employeeGrade + ", Salary: " + salary;
    }
}
