package com.Onesoft.Filpkart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="purchase")
public class PurchasedEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
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
	public int getRefer_key() {
		return refer_key;
	}
	public void setRefer_key(int refer_key) {
		this.refer_key = refer_key;
	}
	private String name;
	private int refer_key;

}
