package de.tum.in.ase.eist.university;

import de.tum.in.ase.eist.university.Lecturer;

import java.time.LocalDate;

public class AdjunctProfessor extends Lecturer {
    public AdjunctProfessor(String firstName, String lastName, LocalDate birthDate) {
        super(firstName, lastName, birthDate);
    }
}
