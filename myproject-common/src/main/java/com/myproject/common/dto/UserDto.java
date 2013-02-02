package com.myproject.common.dto;

/**
 * @author Anatoly Selitsky
 */
public class UserDto extends BaseDto {

    private String username;
    private String firstName;
    private String lastName;
    private Integer age;

    public UserDto() {
        // do nothing
    }

    public UserDto(Long id,String username, String firstName, String lastName, Integer age) {
        super(id);
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

}
