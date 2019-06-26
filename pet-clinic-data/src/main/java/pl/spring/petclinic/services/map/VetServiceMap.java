package pl.spring.petclinic.services.map;

import pl.spring.petclinic.model.Vet;
import pl.spring.petclinic.services.VetService;

import java.util.Set;

/**
 * Created by A.Wójcik on 20.06.2019.
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
