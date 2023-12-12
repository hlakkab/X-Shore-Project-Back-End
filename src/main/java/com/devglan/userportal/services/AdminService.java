package com.devglan.userportal.services;


import com.devglan.userportal.models.Admin;

public interface AdminService {
	 Admin findByMemailAndMpassword(String Memail, String Mpassword);
}
