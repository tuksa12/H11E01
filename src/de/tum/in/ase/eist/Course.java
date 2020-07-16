package de.tum.in.ase.eist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String title;
    private Lecturer lecturer;
    private List<LocalDate> dates;
    private List<Student> attendees = new ArrayList<>();
    private List<Exam> exams;

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public List<LocalDate> getDates() {
        return dates;
    }

    public void setDates(List<LocalDate> dates) {
        this.dates = dates;
    }

    public List<Student> getAttendees() {
        return attendees;
    }

    public void addAttendee(Student student) {
        if (this.attendees != null && !this.attendees.contains(student)) {
            this.attendees.add(student);
        }
    }

    public void setAttendees(List<Student> attendees) {
        this.attendees = attendees;
    }

    public int getNumberOfAttendees() {
        return attendees != null ? attendees.size() : 0;
    }

    public List<Exam> getExams() {
        return exams;
    }

    public void addExam(Exam exam) {
        if (this.exams != null && !this.exams.contains(exam)) {
            this.exams.add(exam);
        }
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }

    public boolean isDiscussionAllowed(Person person) {
        if (person instanceof Lecturer) {
            return person.equals(lecturer);
        } else if (person instanceof Student) {
            return attendees.contains(person);
        }
        return false;
    }
}
