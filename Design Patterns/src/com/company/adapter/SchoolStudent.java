package com.company.adapter;

public class SchoolStudent {
    private String name;
    private String lastName;
    private String emailAddress;


    public SchoolStudent(String name, String lastName, String emailAddress) {
        this.name = name;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
