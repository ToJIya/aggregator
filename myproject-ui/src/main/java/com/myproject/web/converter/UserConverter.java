package com.myproject.web.converter;

import com.myproject.common.dto.UserDto;
import com.myproject.database.domain.User;
import org.springframework.stereotype.Component;

/**
 * @author Anatoly Selitsky
 */
@Component
public class UserConverter implements Converter<UserDto, User> {

    public User toDomain(UserDto userDto) {
        User destination = new User();
        destination.setUsername(userDto.getUsername());
        destination.setFirstName(userDto.getFirstName());
        destination.setLastName(userDto.getLastName());
        destination.setAge(userDto.getAge());
        return destination;
    }
}
