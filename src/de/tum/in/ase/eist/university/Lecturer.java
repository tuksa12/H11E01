package de.tum.in.ase.eist.university;

import java.time.LocalDate;
import java.util.List;

public class Lecturer extends Person {
    private List<Course> courseList;
    private int employeeID;

    public Lecturer(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public void printPersonalInformation() {
        System.out
                .println("Lecturer: " + getFirstName() + " " + getLastName() + " " + getBirthDate() + " " + employeeID);
    }
}
