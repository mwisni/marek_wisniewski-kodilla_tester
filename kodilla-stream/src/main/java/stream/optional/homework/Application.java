package stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {

        Teacher ifNullTeacher = new Teacher("<undefined>");

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Marek", new Teacher("prof. Stefan")));
        studentList.add(new Student("Arek", null));
        studentList.add(new Student("Darek", new Teacher("Jan Kowalski")));
        studentList.add(new Student("Jarek", null));

        for (Student students: studentList) {
            System.out.println("uczeń: " + students.name + " nauczyciel: " + Optional.ofNullable(students.teacher).orElse(ifNullTeacher));

        }

    }
}
