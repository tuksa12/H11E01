package de.tum.in.ase.eist;

import java.time.LocalDate;

public class Professor extends Lecturer {
    public Professor(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }
}
