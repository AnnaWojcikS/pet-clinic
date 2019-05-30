package pl.spring.petclinic.services;

import pl.spring.petclinic.model.Pet;

import java.util.Set;

/**
 * Created by A.Wójcik on 31 maj 2019.
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
