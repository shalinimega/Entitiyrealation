package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.RoleNotException.IdNotFoundException;
import com.employee.RoleNotException.RoleNotException;
import com.employee.entity.Employee;
import com.employee.services.EmployeeServices;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServices es;
	@PostMapping(path="/pacth")
	public String patchData(@RequestBody Employee a)
	{
		return es.patchData(a);
	}
	@PostMapping(path="/pacth1")

	public String patchData(@RequestBody List<Employee> aa)
	{
		return es.patchData(aa);
	}
	@GetMapping(path="/patch2/{a}")
	public Employee getData(@PathVariable int a)
	{
		return es.getData(a);
	}
	@GetMapping(path="/patch3")
	public List<Employee> getMessage()
	{
		return es.getMessage();
	}
	//updateing all
	@PatchMapping(path="/patch3/{x}")
    public String patchData(@RequestBody Employee e,@PathVariable int x)    {
		return es.patchData(e,x);
    }
	
	
	
	//update single
	@GetMapping(path="/patch4/{a}")
	public List<Employee> getempByGen(@PathVariable String a)
	{
		return es.getempByGen(a);
	}
	
	//exception
	@GetMapping(path="/patch5/{x}")
	public Employee getEmpById(@PathVariable int x)
	{
		return es.getEmpById(x);
	}
	//throwexception
	@GetMapping(path="/patch6/{e}/{x}")
    public Employee getEmp(@PathVariable int  e,@PathVariable int x)
    {
		return es.getEmp(e,x);
    }
	@PostMapping(path="/send")
	public String sendData(@RequestBody Employee e)throws RoleNotException
	{
		return es.sendData(e);
	}
	@GetMapping(path="/sendthrow/{ee}")
	public Employee sendthrowData(@PathVariable int ee)throws IdNotFoundException
	{
		return es.sendthrowData(ee);
	}

}
