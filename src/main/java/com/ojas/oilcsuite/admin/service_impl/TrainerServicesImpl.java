package com.ojas.oilcsuite.admin.service_impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.oilcsuite.admin.entity.LoginHelper;
import com.ojas.oilcsuite.admin.entity.TrainerEntity;
import com.ojas.oilcsuite.admin.repo.TrainerRepo;
import com.ojas.oilcsuite.admin.service.TrainerServices;

@Service
public class TrainerServicesImpl implements TrainerServices {

	@Autowired
	private TrainerRepo repo;

	@Override
	public TrainerEntity saveTrainer(TrainerEntity trainerEntity) {
		TrainerEntity save = repo.save(trainerEntity);
		return save;

	}

	@Override
	public List<TrainerEntity> viewAllTrainers() {
		List<TrainerEntity> findAll = repo.findAll();
		return findAll;
	}

	@Override
	public TrainerEntity getTrainerById(Integer id) {
		Optional<TrainerEntity> findById = repo.findById(id);
		TrainerEntity trainerEntity = findById.get();
		return trainerEntity;
	}

	@Override
	public boolean deleteTrainerById(Integer id) {
		Optional<TrainerEntity> findById = repo.findById(id);
		TrainerEntity trainerEntity = findById.get();
		if (trainerEntity != null) {
			repo.delete(trainerEntity);
			return true;
		}
		return false;
	}

	@Override
	public boolean isTrainerValid(LoginHelper helper) {
		TrainerEntity findByUser_name = repo.findByUsername(helper.getUsername());
		if (findByUser_name != null) {
			if (helper.getPassword().equals(findByUser_name.getPassword())) {
				return true;
			}
		}
		return false;
	}

}
