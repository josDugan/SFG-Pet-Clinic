package guru.springframework.sfgpetclinic.data.repositories;

import guru.springframework.sfgpetclinic.data.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
