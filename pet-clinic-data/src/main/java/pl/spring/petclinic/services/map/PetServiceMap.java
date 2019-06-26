package pl.spring.petclinic.services.map;

import org.springframework.stereotype.Service;
import pl.spring.petclinic.model.Pet;
import pl.spring.petclinic.services.CrudService;

import java.util.Set;

/**
 * Created by A.Wójcik on 20.06.2019.
 */

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
