package com.farmersmart.seller.Service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.farmersmart.seller.Entity.EntitySeller;
import com.farmersmart.seller.Entity.RepositorySeller;
@Service
public class ServiceSeller {
	
	private static final Logger logger = LoggerFactory.getLogger(ServiceSeller.class);
	
	@Autowired
	RepositorySeller repository;

	public String addProduct(@RequestBody EntitySeller entity) {
		// TODO Auto-generated method stub
		System.out.println(entity.toString());
		logger.info(entity.toString());
		repository.save(entity);
		return "Record has been added successfully";
		
	}

	public List<EntitySeller> getProductDetails() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Optional<EntitySeller> getProductById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	public List<EntitySeller> getProductByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByname(name);
	}

	public List<EntitySeller> getProductByNameAndCity(String name, String city) {
		// TODO Auto-generated method stub
		return repository.findByNameAndCity(name, city);
	}

	public String deleteById(int id) {
		// TODO Auto-generated method stub
		String message;
		try {
			message="Record has been deleted successfully";
			repository.deleteById(id);
			logger.info(message);
		}catch(Exception e) {
			message="Invalid id";
			logger.error(message);
		}return message;
	}

	public String updateProducts(EntitySeller entity) {
		// TODO Auto-generated method stub
		repository.save(entity);
		return "Record has been updated successfully";
	}

}
