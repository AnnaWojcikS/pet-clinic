package pl.spring.petclinic.services;

import pl.spring.petclinic.model.Vet;

import java.util.Set;

/**
 * Created by A.Wójcik on 31 maj 2019.
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
