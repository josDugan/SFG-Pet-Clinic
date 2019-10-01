package guru.springframework.sfgpetclinic.data.repositories;

import guru.springframework.sfgpetclinic.data.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
