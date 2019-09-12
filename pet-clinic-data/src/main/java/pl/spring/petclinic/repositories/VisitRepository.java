package pl.spring.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.spring.petclinic.model.Visit;

/**
 * Created by A.Wójcik on 12.09.2019.
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
