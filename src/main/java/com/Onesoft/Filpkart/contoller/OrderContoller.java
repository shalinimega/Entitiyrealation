package com.Onesoft.Filpkart.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Onesoft.Filpkart.entity.Order;
import com.Onesoft.Filpkart.serives.Orderservice;

@RestController
public class OrderContoller {
	@Autowired
	Orderservice os;
	@PostMapping("senddata1")
	public String senddata(@RequestBody Order aa)
	{
		return os.senddata(aa);
	}
	@GetMapping("getdata")
	public List<Order> getall()
	{
		return os.getall();
	}
	@PostMapping("postall")
	public String senddata(@RequestBody List<Order> aa)
	{
		return os.senddata(aa);
	}
	@GetMapping("getall")
	public List<Object> geta()
	{
		return os.geta();
	}
	
	

}
