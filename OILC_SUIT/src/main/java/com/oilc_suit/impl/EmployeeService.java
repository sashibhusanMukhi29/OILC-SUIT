package com.oilc_suit.impl;

import java.util.List;

import com.oilc_suit.enitity.EmployeeEntity;

public interface EmployeeService  {
	
	EmployeeEntity add(EmployeeEntity employeeEntity);
	List<EmployeeEntity> viewAll();
	EmployeeEntity getEmployeeById(Long id);
	EmployeeEntity updateEmployee(EmployeeEntity employeeEntity,Long id);
	void deleteEmployee(Long id);

}
