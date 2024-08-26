package com.example.controller;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Appleentity;
import com.example.repo.Applerepo;
import com.example.service.Appleservice;




/*notes:
	1)Lose coppling means every module need to work without depending on eachother thats why REST API 
	comes into picture
	 Common field used in project
	 1)Entity->fields
	 2)Controller->redirecting
	 3)repo->db operations
	 4)service->bussiness logic
	 
	 UPDATE MAPPING
	 1)PUT->updates all field change
	 2)PATCH->only few fields
	 */
//@Controller
@RestController
@RequestMapping("/api/v1/")
public class Applecontroller {
	
	@Autowired
	Appleservice appleservice;
	
	@Autowired
	Applerepo repo;
	@PostMapping("/apple")
	@ResponseStatus(HttpStatus.CREATED)
	public Appleentity createproduct(@RequestBody Appleentity appleentity) {
		return appleservice.insertintorepo(appleentity);
	}
	
	@GetMapping("/apple/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Appleentity getproductid(@PathVariable int id) {
		return appleservice.getbyid(id);
	}
	
	@PutMapping("/apple/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Appleentity updateproduct(@PathVariable int id,@RequestBody Appleentity oldentity) {
		 
		return appleservice.updatebyid(id,oldentity);
	}
	@GetMapping("/apple")
	@ResponseStatus(HttpStatus.OK)
	public List<Appleentity>getalldetails(){
		return appleservice.getall();
	}
	@DeleteMapping("/apple/{id}")
		public void deletebyid(@PathVariable int id) {
			repo.deleteById(id);
		}
	}


	