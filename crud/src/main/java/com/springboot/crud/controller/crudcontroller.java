package com.springboot.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.model.crudmodel;
import com.springboot.crud.service.crudservice;

@RestController
public class crudcontroller {

	
	@Autowired
	private crudservice service;
	
	@PostMapping("/users")
	public crudmodel addUser(@RequestBody crudmodel user) {
		return service.adduser(user);
	
	}
	
	@GetMapping("/getData")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<crudmodel> getUser() {
		return service.fetchUser();
	}
	
	
	@GetMapping("/getDataById/{id}")
	public Optional<crudmodel> getDataById(@PathVariable int id){
		return service.getUserDataById(id);
	}
	
	
	@PutMapping("/UpdateUsers")
	public crudmodel updateUser(@RequestBody crudmodel user) {
		return service.updateUser(user);
	
	}
	
	@DeleteMapping("/deleteDataById/{id}")
	public String deleteDataById(@PathVariable int id) {
		return service.deleteById(id);
	}
	public void controllerProcess() {
		
	}

	
	

}
