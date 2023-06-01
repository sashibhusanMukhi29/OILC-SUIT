package com.ojas.oilcsuite.admin.service;

import java.util.List;

import com.ojas.oilcsuite.admin.entity.LoginHelper;
import com.ojas.oilcsuite.admin.entity.TrainerEntity;

public interface TrainerServices {

	public TrainerEntity saveTrainer(TrainerEntity trainerEntity);
	
	public List<TrainerEntity> viewAllTrainers();
	
	public TrainerEntity getTrainerById(Integer id);	
		
	public boolean deleteTrainerById(Integer id);
	
	public boolean isTrainerValid(LoginHelper helper);
}
