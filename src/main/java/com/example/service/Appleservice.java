package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Appleentity;
import com.example.exception.Appleexception;
import com.example.repo.Applerepo;

@Service
public class Appleservice {
	
	/*Notes
	   ->.save method for insertion*/
	
	@Autowired
	Applerepo repo;
	
	public Appleentity insertintorepo(Appleentity appleentity) {
	return repo.save(appleentity);
	}

public Appleentity getbyid(int id) {
	Appleentity entity=repo.findById(id).orElseThrow(()->new Appleexception("id not found"+id));     
		return entity;
	}

  public Appleentity updatebyid(int id, Appleentity oldentity) {
   Appleentity newentity=repo.findById(id).orElse(new Appleentity());
       newentity.setModelname(oldentity.getModelname());
          newentity.setPrice(oldentity.getPrice());
              repo.save(newentity);
         return newentity;

}

public List<Appleentity> getall() {
	List<Appleentity>apple=repo.findAll();
	return apple;
}

}
