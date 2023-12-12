package com.devglan.userportal.repository;

import com.devglan.userportal.models.Admin;
import org.springframework.data.repository.Repository;


public interface AdminRepository extends Repository<Admin, Integer> {
	 Admin findByMemailAndMpassword(String Memail, String Mpassword);
}
