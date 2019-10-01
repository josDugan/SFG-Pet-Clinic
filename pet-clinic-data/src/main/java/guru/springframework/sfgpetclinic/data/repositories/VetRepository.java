package guru.springframework.sfgpetclinic.data.repositories;

import guru.springframework.sfgpetclinic.data.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
