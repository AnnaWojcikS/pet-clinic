package pl.spring.petclinic.model;

import java.io.Serializable;

/**
 * Created by A.Wójcik on 31 maj 2019.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
