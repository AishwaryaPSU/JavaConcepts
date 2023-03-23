package customsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ranking {
    public static void main(String[] args) {
        //create a class of students;
        List<Student> classOfStudents = createClass();
        System.out.println(Arrays.asList(classOfStudents));
        Collections.sort(classOfStudents, Student.CGPABasedComparator);
        System.out.println("After Sorting.......");
        System.out.println(Arrays.asList(classOfStudents));
        Collections.sort(classOfStudents, Student.LastNameBasedComparator);
        System.out.println("After Sorting by last name.......");
        System.out.println(Arrays.asList(classOfStudents));
    }

    private static List<Student> createClass() {
        List<Student> classOfStudents = new ArrayList<>();
        classOfStudents.add(new Student(33, "Anna", "Carl", 3.80));
        classOfStudents.add(new Student(21, "Dustin", "Wang", 3.80));
        classOfStudents.add(new Student(334, "Dennis", "Ron", 3.5));
        classOfStudents.add(new Student(343, "Ronald", "Wisley", 3.75));
        classOfStudents.add(new Student(3, "Shawn", "Mendis", 3.2));
        classOfStudents.add(new Student(12, "Taylor", "Swift", 3.23));
        classOfStudents.add(new Student(40, "Lucy", "Lui", 3.7));
        classOfStudents.add(new Student(33, "Andrew", "Agustin", 3.1));
        classOfStudents.add(new Student(33, "Tom", "Brown", 3.24));
        classOfStudents.add(new Student(33, "Tom", "Scott", 3.04));
        return classOfStudents;
    }
}
