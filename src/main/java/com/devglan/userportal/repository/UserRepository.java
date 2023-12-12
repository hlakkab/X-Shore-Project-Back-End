package com.devglan.userportal.repository;

import com.devglan.userportal.models.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<User, Integer> {

    void delete(User user);

    List<User> findAll();

    User findById(int id);

    User save(User user);
    
    User findByEmailAndPsw(String email, String psw);


}
