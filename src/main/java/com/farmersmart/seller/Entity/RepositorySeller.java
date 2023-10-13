package com.farmersmart.seller.Entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RepositorySeller extends JpaRepository<EntitySeller, Integer>{

	public List<EntitySeller> findByname(String name);
	public List<EntitySeller> findByNameAndCity(String name, String city);
	

}
