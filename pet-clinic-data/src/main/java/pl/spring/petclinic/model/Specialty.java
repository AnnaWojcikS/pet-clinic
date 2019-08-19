package pl.spring.petclinic.model;

/**
 * Created by A.Wójcik on 19.08.2019.
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
