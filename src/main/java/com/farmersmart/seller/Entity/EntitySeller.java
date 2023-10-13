package com.farmersmart.seller.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="seller")
public class EntitySeller {
	
	@Id
	int id;
	String name;
	String product_name;
	String city;
	long phone;
	int pincode;
	public EntitySeller(){
		super();
		
	}
	public EntitySeller(int id, String name, String product_name, String city, long phone, int pincode) {
		super();
		this.id = id;
		this.name = name;
		this.product_name = product_name;
		this.city = city;
		this.phone = phone;
		this.pincode = pincode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "EntitySeller [id=" + id + ", name=" + name + ", product_name=" + product_name + ", city=" + city
				+ ", phone=" + phone + ", pincode=" + pincode + "]";
	}
	
	
	

}
