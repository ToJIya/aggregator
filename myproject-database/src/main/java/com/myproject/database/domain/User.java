package com.myproject.database.domain;

import com.myproject.common.dto.HasDto;
import com.myproject.common.dto.UserDto;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author Anatoly Selitsky
 */
@Entity
@Table
@NamedQueries({
        @NamedQuery(name = User.GET_ALL_USER, query = "select u from User u")
})
public class User extends BaseEntity implements HasDto<UserDto> {

    public static final String GET_ALL_USER = "getAllUser";

    private String username;
    private String firstName;
    private String lastName;
    private Integer age;

    public User() {
        // do nothing
    }

    public User(Long id, String username, String firstName, String lastName, Integer age) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserDto toDto() {
        return new UserDto(getId(), username, firstName, lastName, age);
    }

}
