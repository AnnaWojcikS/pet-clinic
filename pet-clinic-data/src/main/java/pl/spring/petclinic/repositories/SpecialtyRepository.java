package pl.spring.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.spring.petclinic.model.Specialty;

/**
 * Created by A.Wójcik on 12.09.2019.
 */
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
