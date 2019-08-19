package pl.spring.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.spring.petclinic.model.Owner;
import pl.spring.petclinic.model.Pet;
import pl.spring.petclinic.model.PetType;
import pl.spring.petclinic.model.Vet;
import pl.spring.petclinic.services.OwnerService;
import pl.spring.petclinic.services.PetTypeService;
import pl.spring.petclinic.services.VetService;

import java.time.LocalDate;

/**
 * Created by A.Wójcik on 26.06.2019.
 */

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

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
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Sandy Lane");
        owner1.setCity("Miami");
        owner1.setTelephone("145236");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setOwner(owner1);
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Sandy Lane");
        owner2.setCity("Miami");
        owner2.setTelephone("145236");

        Pet fionasCat = new Pet();
        fionasCat.setPetType(savedCatPetType);
        fionasCat.setName("Some Cat");
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setOwner(owner2);
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("John");
        vet2.setLastName("Goodman");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");



    }
}
