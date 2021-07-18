package de.tum.in.ase.eist.university;

import de.tum.in.ase.eist.university.Lecturer;

import java.time.LocalDate;

public class PostDoc extends Lecturer {
    public PostDoc(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }
}
