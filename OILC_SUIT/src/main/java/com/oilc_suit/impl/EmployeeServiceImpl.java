package com.oilc_suit.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oilc_suit.enitity.EmployeeEntity;
import com.oilc_suit.exceptions.UserNotFound;
import com.oilc_suit.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public EmployeeEntity add(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employeeEntity);
	}

	@Override
	public List<EmployeeEntity> viewAll() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public EmployeeEntity getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		EmployeeEntity findById = employeeRepo.findById(id).orElseThrow(()->new UserNotFound("employee is not found" + id));
		return findById;
	}

	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity, Long id) {
		// TODO Auto-generated method stub
		EmployeeEntity update = employeeRepo.findById(id).orElseThrow(()->new UserNotFound("employee is not found" + id));
		update.setFName(employeeEntity.getFName());
		update.setLName(employeeEntity.getLName());
		update.setFullName(employeeEntity.getFullName());
		update.setPhone(employeeEntity.getPhone());
		update.setEmail(employeeEntity.getEmail());
		update.setPassword(employeeEntity.getPassword());
		update.setTechology(employeeEntity.getTechology());
		update.setGuardian(employeeEntity.getGuardian());
		update.setProfilePic(employeeEntity.getProfilePic());
		employeeRepo.save(update);
		return update;
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		EmployeeEntity emEntity=employeeRepo.findById(id).orElseThrow(()->new UserNotFound("employee is not found" + id));
		
		if(emEntity!=null) {
			employeeRepo.deleteById(id);
		}
		
	}

}
