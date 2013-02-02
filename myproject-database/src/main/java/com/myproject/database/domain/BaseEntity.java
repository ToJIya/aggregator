package com.myproject.database.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author Anatoly Selitsky
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    private Long id;

    public BaseEntity() {
        // do nothing
    }

    public BaseEntity(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
