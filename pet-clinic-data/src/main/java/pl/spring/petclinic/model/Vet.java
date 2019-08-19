package pl.spring.petclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by A.Wójcik on 28 maj 2019.
 */
public class Vet extends Person {

    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
