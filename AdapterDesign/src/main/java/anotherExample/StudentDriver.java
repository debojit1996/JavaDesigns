package anotherExample;

import java.util.ArrayList;
import java.util.List;

public class StudentDriver {
    public static void main(String[] args) {
        CollegeStudent collegeStudent = new CollegeStudent("Ban", "Paul", "ban@gmail.com");
        SchoolStudent schoolStudent = new SchoolStudent("Shunu", "Paul", "shunu@gmail.com");

        // Now lets say we want to construct an array of students and add both CollegeStudent and SchoolStudent types into that
        // Also, consider that schoolStudent is an external library class object which cannot be modified. So, the only way to add both objects
        // with different member variable names to the same array is by having an Adapter/Mapper that converts SchoolStudent model
        // corresponding to collegeStudent variable names
        List<Student> students = new ArrayList<>();
        students.add(collegeStudent);
        students.add(new SchoolStudentAdapter(schoolStudent)); // the adapter must implement the Student interface here so that it can be added in the same list

        System.out.println(students);
    }
}
