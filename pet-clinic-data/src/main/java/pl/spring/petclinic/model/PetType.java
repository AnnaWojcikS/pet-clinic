package pl.spring.petclinic.model;

/**
 * Created by A.Wójcik on 28 maj 2019.
 */
public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
