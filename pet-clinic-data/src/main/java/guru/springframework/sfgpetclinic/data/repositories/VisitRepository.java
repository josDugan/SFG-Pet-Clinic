package guru.springframework.sfgpetclinic.data.repositories;

import guru.springframework.sfgpetclinic.data.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
