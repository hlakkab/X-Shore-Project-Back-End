package com.devglan.userportal.serviceImpl;

import com.devglan.userportal.repository.AdminRepository;
import com.devglan.userportal.models.Admin;
import com.devglan.userportal.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

@EnableAspectJAutoProxy(proxyTargetClass = false)
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository repository;

   	@Override
    public Admin findByMemailAndMpassword(String Memail, String Mpassword) {
		return repository.findByMemailAndMpassword( Memail, Mpassword);
	}
}
