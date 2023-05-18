package com.oilc_suit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oilc_suit.enitity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long>{

}
