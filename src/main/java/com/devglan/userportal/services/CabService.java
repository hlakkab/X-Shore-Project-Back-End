package com.devglan.userportal.services;

import com.devglan.userportal.models.Cab;

import java.util.List;

public interface CabService {
	List<Cab> findAll();
	
    List<Cab> findByCompnyId(String CompnyId);
    
    Cab update(Cab cab);
    
    Cab findBycid(int i);
}
