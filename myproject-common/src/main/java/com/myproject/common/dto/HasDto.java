package com.myproject.common.dto;

/**
 * @author Anatoly Selitsky
 */
public interface HasDto<DTO extends BaseDto> {

    DTO toDto();

}
