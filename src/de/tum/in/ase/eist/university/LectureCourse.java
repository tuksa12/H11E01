package de.tum.in.ase.eist.university;

import de.tum.in.ase.eist.university.Course;

public class LectureCourse extends Course {

    private String location;

    public LectureCourse(String title, String location) {
        super(title);
        this.setLocation(location);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
