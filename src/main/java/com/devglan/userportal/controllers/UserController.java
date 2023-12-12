package com.devglan.userportal.controllers;

import com.devglan.userportal.models.Cab;
import com.devglan.userportal.models.User;
import com.devglan.userportal.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/users"})
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class UserController {
	
    @Autowired
    private UserService userService;

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public User findOne(@PathVariable("id") int id){
        return userService.findById(id);
    }
        
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public User findByEmailAndPsw(@RequestBody User loginUser) 
	{
		return userService.findByEmailAndPsw(loginUser.getEmail(),loginUser.getPassword());
	}
    
    @PutMapping(path = {"/{id}"})
    public User update(@PathVariable("id") int id, @RequestBody User user){
        user.setId(id);
        return userService.update(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public User delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @PostMapping(path ={"/{id}"})
    public User getClientInfo(@PathVariable("id") int id) {
        return userService.findById(id);
    } // New

    @GetMapping(path = {"/{id}"})
    public List<Cab> findAllCabsByUserId(@PathVariable("id") int id){
        return userService.getAllCabsByUserId(id);
    } //New

    @PostMapping(path = {"/{id}"})
    public void create(@RequestBody Cab cab,@PathVariable("id") int id){
        userService.createCab(cab,id);
    } //T9d dir prob
}
