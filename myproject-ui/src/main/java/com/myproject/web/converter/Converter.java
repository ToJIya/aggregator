package com.myproject.web.converter;

import com.myproject.common.dto.BaseDto;
import com.myproject.database.domain.BaseEntity;

/**
 * @author Anatoly Selitsky
 */
public interface Converter<DTO extends BaseDto, DOMAIN extends BaseEntity> {

    public DOMAIN toDomain(DTO dto);

}
