package oopslevel2;

import java.math.BigDecimal;

public class EmployeeRunner {
    
        public static void main(String[] args) {
            // Employee employee = new Employee("Anshika", "anshikathakur147@gmail.com", "1234567897", "Software Engineer", "Google", 'A',  new BigDecimal("75000.50"));
            Employee employee = new Employee("Anshika", "anshikathakur147@gmail.com", "1234567897", "Software Engineer", "Google", 'A', new BigDecimal("75000.50"));
            // to be implemented like this its not defined in a constructor
            // employee.setName("Anshika");
            // employee.setEmail("anshika@gmail.com");
            // employee.setPhone("1234567890");
            // employee.setTitle("Software Engineer");
            // employee.setEmployer("Google");
            // employee.setEmployeeGrade('A');
            // employee.setSalary(new BigDecimal("75000.50"));
            

            System.out.println(employee);
        }

}
