package com.devglan.userportal.services;

import com.devglan.userportal.models.Cab;
import com.devglan.userportal.models.User;

import java.util.List;

public interface UserService {

    User create(User user);

    void createCab(Cab cab, int id);

    User delete(int id);

    List<User> findAll();

    User findById(int id);

    User update(User user);
    
    User findByEmailAndPsw(String email, String psw);

    List<Cab> getAllCabsByUserId(int userId);

}
