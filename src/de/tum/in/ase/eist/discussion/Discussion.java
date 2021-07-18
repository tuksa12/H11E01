package de.tum.in.ase.eist.discussion;

import de.tum.in.ase.eist.university.Course;
import de.tum.in.ase.eist.university.Person;

import java.util.ArrayList;
import java.util.List;

public class Discussion {
    private String topic;
    private Course course = null;
    private final List<Comment<?>> comments = new ArrayList<>();

    public boolean startCourseDiscussion(Course newCourse, Person person, String newTopic) {

        if (!course.isDiscussionAllowed(person)) {
            return false;
        }

        this.course = newCourse;
        this.topic = newTopic;

        return true;
    }

    public boolean addComment(Comment<?> comment) {
        if (comment.save()) {
            comments.add(comment);
            return true;
        } else {
            return false;
        }
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Comment<?>> getComments() {
        return comments;
    }

    public int getNumberOfComments() {
        return comments.size();
    }
}
