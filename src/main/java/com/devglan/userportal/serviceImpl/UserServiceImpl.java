package com.devglan.userportal.serviceImpl;

import com.devglan.userportal.repository.CabRepository;
import com.devglan.userportal.repository.UserRepository;
import com.devglan.userportal.models.Cab;
import com.devglan.userportal.models.User;
import com.devglan.userportal.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@EnableAspectJAutoProxy(proxyTargetClass = false)
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private CabRepository cabRepository;

    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public void createCab(Cab cab, int id) {
        User user = repository.findById(id);
        Cab savedCab = cabRepository.save(cab);
        user.getCab().add(savedCab);
        repository.save(user); // T9d dir prob
    }

    @Override
    public User delete(int id) {
        User user = findById(id);
        if(user != null){
            repository.delete(user);
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findById(int id) {
        return repository.findById(id);
    }

    @Override
    public User update(User user) {
        return repository.save(user);
    }

	@Override
	public User findByEmailAndPsw(String email, String psw) {
		return repository.findByEmailAndPsw(email,psw);
	}

    public List<Cab> getAllCabsByUserId(int userId){
        User user = repository.findById(userId);
        return new ArrayList<>(user.getCab());
    }
}
