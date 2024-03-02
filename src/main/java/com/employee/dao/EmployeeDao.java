package com.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.RoleNotException.IdNotFoundException;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Repository


public class EmployeeDao {
	@Autowired
	EmployeeRepository mr;
	public String patchData(Employee w)
	{
	  mr.save(w);
	  return "sucessful";

}
	public String patchData(List<Employee> aa)
	{
		mr.saveAll(aa);
		return "listData successful";
	}
	public Employee getData(int c)
	{
		return mr.findById(c).get();
	}
	public List<Employee> getMessage()
	{
		return mr.findAll();
	}
	//update
	public Employee getEmpById(int j)
	{
		return mr.getEmpById(j);
	}
	//
	public Employee getEmp(int a,int c)
	{
		return mr.getEmp(a,c);
	}
	public String sendData(Employee e)
	{
		mr.save(e);
		return "sucess";
	}
	public Employee sendthrowData(int a)throws IdNotFoundException
	{
		return mr.findById(a).orElseThrow(()->new IdNotFoundException("not ok"));
	}
	}
	
	

