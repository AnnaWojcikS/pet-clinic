package pl.spring.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.spring.petclinic.model.Vet;

/**
 * Created by A.Wójcik on 12.09.2019.
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
