package com.ojas.oilcsuite.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ojas.oilcsuite.admin.entity.TrainerEntity;

public interface TrainerRepo extends JpaRepository<TrainerEntity, Integer> {

	TrainerEntity findByUsername(String username);
}
