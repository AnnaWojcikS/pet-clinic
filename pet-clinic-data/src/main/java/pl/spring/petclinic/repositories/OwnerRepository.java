package pl.spring.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.spring.petclinic.model.Owner;

/**
 * Created by A.Wójcik on 12.09.2019.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
