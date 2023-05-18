package com.oilc_suit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oilc_suit.enitity.EmployeeEntity;
import com.oilc_suit.impl.EmployeeService;

@RequestMapping("/employees")
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/add")
	public EmployeeEntity addEmployee(@RequestBody EmployeeEntity emEntity) {

		return employeeService.add(emEntity);

	}

	@GetMapping("/getAll")
	public List<EmployeeEntity> viewAll() {
		return employeeService.viewAll();

	}

	@GetMapping("/employee/{id}")
	public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable long id) {
		return new ResponseEntity<EmployeeEntity>(employeeService.getEmployeeById(id), HttpStatus.OK);

	}

	@GetMapping("/update/{id}")
	public ResponseEntity<EmployeeEntity> updateEmployee(@RequestBody EmployeeEntity emEntity, @PathVariable Long id) {
		return new ResponseEntity<EmployeeEntity>(employeeService.updateEmployee(emEntity, id), HttpStatus.OK);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Long> deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return new ResponseEntity<Long>(id, HttpStatus.OK);

	}
 
}
