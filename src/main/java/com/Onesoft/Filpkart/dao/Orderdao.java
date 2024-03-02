package com.Onesoft.Filpkart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.Onesoft.Filpkart.Repository.OrderRepository;
import com.Onesoft.Filpkart.entity.Order;

@Repository
public class Orderdao {
	@Autowired
	OrderRepository or;
	public String senddata(Order aa)
	{
		 or.save(aa);
		 return "sucessfully";
	}
	public List<Order> getall()
	{
		return or.findAll();
	}
	public String senddata(List<Order> aa)
	{
		 or.saveAll(aa);
		 return "sucessfully";
	}
	public List<Object> geta()
	{
		return or.geta();
	}


}
