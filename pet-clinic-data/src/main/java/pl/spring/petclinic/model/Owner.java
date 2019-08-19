package pl.spring.petclinic.model;

import java.util.Set;

/**
 * Created by A.Wójcik on 31 maj 2019.
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
