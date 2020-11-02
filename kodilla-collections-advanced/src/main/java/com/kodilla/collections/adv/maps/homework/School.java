package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {

    private String schoolName;

    private List<Integer> studentsInClass = new ArrayList<>();

    public School (String schoolName, int ... studentsInClass){
        this.schoolName = schoolName;
        for (int classStudent : studentsInClass)
            this.studentsInClass.add(classStudent);
    }


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStudentsInClass() {
        int students = 0;
        for (int classStudent : studentsInClass)
            students += classStudent;
        return students;
    }

    public void setStudentsInClass(List<Integer> studentsInClass) {
        this.studentsInClass = studentsInClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(schoolName, school.schoolName) &&
                Objects.equals(studentsInClass, school.studentsInClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolName, studentsInClass);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", studentsInClass=" + studentsInClass +
                '}';
    }
}
