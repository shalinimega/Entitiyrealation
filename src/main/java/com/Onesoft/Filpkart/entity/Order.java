package com.Onesoft.Filpkart.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="order_table")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String city;
	private int pincode;
	public List<ProductEntity> getProducts() {
		return products;
	}
	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}
	@OneToMany(targetEntity = ProductEntity.class,cascade=CascadeType.ALL)
	@JoinColumn(name="Order_fkey",referencedColumnName = "id")
	private List<ProductEntity> products;
	/*private List<PurchasedEntity> pur;
	public List<PurchasedEntity> getPur() {
		return pur;
	}
	public void setPur(List<PurchasedEntity> pur) {
		this.pur = pur;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {                             

		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

}
