package com.myproject.database.service;

import com.myproject.database.domain.BaseEntity;

/**
 * @author Anatoly Selitsky
 */
public interface BaseService<DOMAIN extends BaseEntity> {

    void save(DOMAIN entity);

    void delete(DOMAIN entity);

    DOMAIN load(Long entityId);

}
