package com.myproject.database.config;

import com.myproject.database.repository.UserRepository;
import com.myproject.database.repository.impl.UserRepositoryImpl;
import com.myproject.database.service.UserService;
import com.myproject.database.service.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Anatoly Selitsky
 */
@Configuration
@ImportResource("classpath:Hibernate.xml")
@ComponentScan(basePackages = "com.myproject.database")
public class DatabaseModuleConfig {

    @Bean(name = "userRepository")
    public UserRepository initUserRepository() {
        return new UserRepositoryImpl();
    }

    @Bean(name = "userService")
    public UserService intiUserService() {
        return new UserServiceImpl();
    }

}
