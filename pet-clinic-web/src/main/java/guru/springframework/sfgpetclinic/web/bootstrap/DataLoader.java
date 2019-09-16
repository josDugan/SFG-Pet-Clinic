package guru.springframework.sfgpetclinic.web.bootstrap;

import guru.springframework.sfgpetclinic.data.model.Owner;
import guru.springframework.sfgpetclinic.data.model.Pet;
import guru.springframework.sfgpetclinic.data.model.PetType;
import guru.springframework.sfgpetclinic.data.model.Vet;
import guru.springframework.sfgpetclinic.data.services.OwnerService;
import guru.springframework.sfgpetclinic.data.services.PetTypeService;
import guru.springframework.sfgpetclinic.data.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("555-555-5555");

        Pet mikesPet = new Pet();
        mikesPet.setName("Rosco");
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenarre");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("555-555-5555");

        Pet fioanasPet = new Pet();
        fioanasPet.setName("Just Cat");
        fioanasPet.setOwner(owner2);
        fioanasPet.setBirthDate(LocalDate.now());
        fioanasPet.setPetType(savedCatPetType);
        owner2.getPets().add(fioanasPet);
        
        ownerService.save(owner2);

        System.out.println("Loaded Onwers...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
