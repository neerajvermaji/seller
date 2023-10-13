package com.farmersmart.seller.Controller;

import java.util.List;
import java.util.Optional;

//import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.farmersmart.seller.Entity.EntitySeller;
import com.farmersmart.seller.Service.ServiceSeller;
@RestController
public class ControllerSeller {
	@Autowired
	ServiceSeller service;
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody EntitySeller entity) {
		
		return service.addProduct(entity);
	}
	
	@GetMapping("/getProductDetails")
	public List<EntitySeller> getProductDetails(){
		return service.getProductDetails();
	}
	
	@GetMapping("/getProductById")
	public Optional<EntitySeller> getProductById(@RequestParam int id){
		return service.getProductById(id);
	}
	
	@GetMapping("/getProductByName")
	public List<EntitySeller> getProductByName(@RequestParam String name){
		return service.getProductByName(name);
	}
	
	@GetMapping("/getProductByNameAndCity")
	public List<EntitySeller> getProductByNameAndCity(@RequestParam String name,@RequestParam String city){
		return service.getProductByNameAndCity(name,city);
	}
	
	@DeleteMapping("/deleteById")
	public String deleteById(@RequestParam int id) {
		return service.deleteById(id);
	}
	 
	@PutMapping("/updateProducts")
	public String updateProducts(@RequestBody EntitySeller entity) {
		return service.updateProducts(entity);
	}

}
