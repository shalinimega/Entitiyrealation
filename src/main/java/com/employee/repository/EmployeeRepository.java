
package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.employee.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	@Query(value="select * from emp_details where id=?",nativeQuery=true)
	public Employee getEmpById(int h);
	
	@Query(value="select * from emp_details where salary between ? and ?", nativeQuery=true)
	public Employee getEmp(int a,int b);


}
