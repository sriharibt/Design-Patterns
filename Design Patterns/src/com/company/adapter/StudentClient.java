package com.company.adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {



    public List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();
        CollegeStudent collegeStudent = new CollegeStudent("srihari", "bt", "srihari915@gmail.com");

        SchoolStudent schoolStudent = new SchoolStudent("abc", "def", "abc.def@gmail.com");

        students.add(collegeStudent);
        students.add(new SchoolStudentAdapter(schoolStudent));

        return students;

    }
}
