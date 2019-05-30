package pl.spring.petclinic.services;

import pl.spring.petclinic.model.Owner;

import java.util.Set;

/**
 * Created by A.Wójcik on 31 maj 2019.
 */
    public interface OwnerService {


    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
