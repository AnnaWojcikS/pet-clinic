package pl.spring.petclinic.services;

import pl.spring.petclinic.model.Owner;

/**
 * Created by A.Wójcik on 31 maj 2019.
 */
    public interface OwnerService extends CrudService<Owner, Long>{


    Owner findByLastName(String lastName);


}
