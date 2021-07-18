package de.tum.in.ase.eist.exam;

import de.tum.in.ase.eist.university.Course;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<ExamQuestion> questions;
    private LocalDate examDate;
    private int durationInMinutes;
    private final Course course;

    Exam(Course course) {
        this.course = course;
        questions = new ArrayList<>();
    }

    public List<ExamQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<ExamQuestion> questions) {
        this.questions = questions;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) {
        this.examDate = examDate;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
}
