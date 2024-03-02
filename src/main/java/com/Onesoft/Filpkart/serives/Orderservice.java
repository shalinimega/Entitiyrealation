package com.Onesoft.Filpkart.serives;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.Onesoft.Filpkart.dao.Orderdao;
import com.Onesoft.Filpkart.entity.Order;

@Service
public class Orderservice {
	@Autowired
	Orderdao od;
	public String senddata(Order aa)
	{
		return od.senddata(aa);
	}
	public List<Order> getall()
	{
		return od.getall();
	}
	public String senddata(List<Order> aa)
	{
		return od.senddata(aa);
	}
	
	public List<Object> geta()
	{
		return od.geta();
	}


}
