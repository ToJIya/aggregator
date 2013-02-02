package com.myproject.database.repository;

import com.myproject.database.domain.BaseEntity;

/**
 * @author Anatoly Selitsky
 */
public interface BaseRepository<DOMAIN extends BaseEntity>{

    void save(DOMAIN entity);

    void delete(DOMAIN entity);

    DOMAIN load(Long entityId);

}
