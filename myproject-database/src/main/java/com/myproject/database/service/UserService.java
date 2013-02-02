package com.myproject.database.service;

import com.myproject.database.domain.User;

import java.util.List;

/**
 * @author Anatoly Selitsky
 */
public interface UserService extends BaseService<User> {

    List<User> fetchAllUser();

}
