package de.tum.in.ase.eist;

import java.time.LocalDate;
import java.util.List;

public class Student extends Person {
    private String majorSubject;
    private String minorSubject;
    private List<Course> courseList;
    private int studentID;

    public Student(String firstName, String lastName, LocalDate birthDate, String majorSubject, String minorSubject) {
        super(firstName, lastName, birthDate);
        this.majorSubject = majorSubject;
        this.minorSubject = minorSubject;
    }

    public String getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(String majorSubject) {
        this.majorSubject = majorSubject;
    }

    public String getMinorSubject() {
        return minorSubject;
    }

    public void setMinorSubject(String minorSubject) {
        this.minorSubject = minorSubject;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public void printPersonalInformation() {
        System.out.println("Student: " + getFirstName() + " " + getLastName() + " " + getBirthDate() + " " + studentID);
    }
}
