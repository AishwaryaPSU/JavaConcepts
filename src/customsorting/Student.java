package customsorting;

import java.util.Comparator;

public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private double cgpa;

    public Student(Integer id, String firstName, String lastName, double cgpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cgpa = cgpa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public static Comparator<Student> CGPABasedComparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1,Student s2){
            return (int)(s1.getCgpa()-s2.getCgpa());
        }
    };

    public static Comparator<Student> LastNameBasedComparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getLastName().compareTo(s2.getLastName());
        }
    };

    @Override
    public String toString() {
        return "customsorting.Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cgpa=" + cgpa +
                '}'+"\n";
    }
}
