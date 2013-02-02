package com.myproject.common.dto;

import java.io.Serializable;

/**
 * @author Anatoly Selitsky
 */
public abstract class BaseDto implements Serializable {

    private Long id;

    public BaseDto() {
        // do nothing
    }

    public BaseDto(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
