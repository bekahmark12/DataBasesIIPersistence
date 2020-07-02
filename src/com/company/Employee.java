package com.company;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int hireYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }



    @Override
    public String toString() {
        return "Employee [" +
                "ID: " + getId() + '\n' +
                "First Name: " + getFirstName() + '\n' +
                "Last Name: " + getLastName() + '\n' +
                "Year Hired: " + getHireYear() + '\n' +
                ']';
    }
}
