package pl.spring.petclinic.services.map;

import org.springframework.stereotype.Service;
import pl.spring.petclinic.model.Specialty;
import pl.spring.petclinic.services.SpecialtiesService;

import java.util.Set;

/**
 * Created by A.Wójcik on 19.08.2019.
 */
@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtiesService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }
}
