package com.myproject.database.repository;

import com.myproject.database.domain.User;

import java.util.List;

/**
 * @author Anatoly Selitsky
 */
public interface UserRepository extends BaseRepository<User> {

    List<User> fetchAllUser();

}
