package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Grades;
import com.kodilla.collections.adv.maps.complex.Student;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal, School> principalSchoolMap = new HashMap<>();

        Principal john = new Principal("John", "Johanson");
        Principal alice = new Principal("Alice", "Pinkman");

        School johnSchool = new School("Primary School number 5", 30, 25, 15);
        School aliceSchool = new School("Primary School number 3", 30, 15, 10);


        principalSchoolMap.put(john, johnSchool);
        principalSchoolMap.put(alice, aliceSchool);

        System.out.println(principalSchoolMap.get(alice));

        for (Map.Entry<Principal, School> schoolEntry : principalSchoolMap.entrySet())
            System.out.println(schoolEntry.getKey().getFirstName() + " is a principal in  " +
                    schoolEntry.getValue().getSchoolName() + " their is " + schoolEntry.getValue().getStudentsInClass() + " students." );



    }
}
