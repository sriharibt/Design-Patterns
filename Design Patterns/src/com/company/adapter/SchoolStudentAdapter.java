package com.company.adapter;

public class SchoolStudentAdapter implements Student{

    private SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent){
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getName() {
        return schoolStudent.getName();
    }

    @Override
    public String getSurname() {
        return schoolStudent.getLastName();
    }

    @Override
    public String getEmail() {
        return schoolStudent.getEmailAddress();
    }
}
