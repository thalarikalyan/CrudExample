package com.springboot.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.model.crudmodel;
import com.springboot.crud.repo.crudrepo;

@Service
public class crudservice {
	
	@Autowired
	private crudrepo repo;
	
	public crudmodel adduser(crudmodel user) {
		return repo.save(user);
		
	}

	public List<crudmodel> fetchUser(){
		return repo.findAll();
	}
	
	public Optional<crudmodel> getUserDataById(int id){
		return repo.findById(id);
	}
	
	public crudmodel updateUser(crudmodel user) {
		return repo.save(user);
		
	}
	
	public String deleteById(int id) {
		
		String output;
		
		try {
			repo.deleteById(id);
			output = "delete okay...";
			
		}catch(Exception e) {
			output = "delete not okay...";
		}
		return output;
		
	}
}
