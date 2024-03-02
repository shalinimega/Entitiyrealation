package com.employee.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.RoleNotException.IdNotFoundException;
import com.employee.RoleNotException.RoleNotException;
import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service

public class EmployeeServices {
	@Autowired
	EmployeeDao da;
	@Autowired
	EmployeeRepository er;
	
	
	public String patchData(Employee a)
	{
		return da.patchData(a);
	}
	public String patchData(List<Employee> aa)
	{
		return da.patchData(aa);
	}
	public Employee getData(int b)
	{
		return da.getData(b);
	}
	public List<Employee> getMessage()
	{
		return da.getMessage();
	}
	public String patchData(Employee em,int a)
	{
		Employee emp=getData(a);
		if(em.getName()!=null && em.getName().length()>0)
		{
			emp.setName(em.getName());
		}
		if(em.getSalary()>0) {
			emp.setSalary(em.getSalary());	
		}
		 er.save(emp);
		 return "data successful update";
		
	}
	
	
	public List<Employee> getempByGen(String x)
	{
		List<Employee> ma=getMessage().stream().filter(y->y.getGender().equals(x)).collect(Collectors.toList());
		return ma;
	}
	public Employee getEmpById(int a)
	{
		return er.getEmpById(a);
	}
	public Employee getEmp(int b,int c)
	{
		return er.getEmp(b,c);
	}
	public String sendData(Employee ee)throws RoleNotException
	{
		if(ee.getDesignation().equals("designer"))
		{
			throw new RoleNotException("it is not proper role");
		}
		else
		{
			return da.sendData(ee);
		
		}
	}
	public Employee sendthrowData(int a)throws IdNotFoundException
	{
		return  da.sendthrowData(a);
		
	}



	
	

}
