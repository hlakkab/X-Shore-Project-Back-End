package com.devglan.userportal.repository;

import com.devglan.userportal.models.Cab;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CabRepository extends Repository<Cab, Integer> {
  
    List<Cab> findAll();
    
    List<Cab> findByCompnyId(String CompnyId);
    
    Cab save(Cab cab);
    
    Cab findByCid(int cid);
}
