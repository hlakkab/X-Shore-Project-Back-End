package com.devglan.userportal.repository;

import com.devglan.userportal.models.Trips;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface TripsRepository extends Repository<Trips, Integer> {
  
    List<Trips> findAll();
    
    Trips findByuserid(String userid);
    
    List<Trips> findByCid(String cid);
    
    Trips save(Trips trips);
    
    void delete(Trips trips);
   
}
