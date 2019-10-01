package guru.springframework.sfgpetclinic.data.repositories;

import guru.springframework.sfgpetclinic.data.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
