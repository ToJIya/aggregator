package com.myproject.database.service.impl;

import com.myproject.database.domain.User;
import com.myproject.database.repository.UserRepository;
import com.myproject.database.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Anatoly Selitsky
 */
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> fetchAllUser() {
        return userRepository.fetchAllUser();
    }

    @Transactional
    public void save(User entity) {
        userRepository.save(entity);
    }

    @Transactional
    public void delete(User entity) {
        userRepository.delete(entity);
    }

    public User load(Long entityId) {
        return userRepository.load(entityId);
    }

}
