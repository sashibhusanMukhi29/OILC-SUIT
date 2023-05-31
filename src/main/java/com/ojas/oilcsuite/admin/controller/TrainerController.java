package com.ojas.oilcsuite.admin.controller;

import java.util.List;

import javax.validation.Valid;

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

import com.ojas.oilcsuite.admin.entity.LoginHelper;
import com.ojas.oilcsuite.admin.entity.TrainerEntity;
import com.ojas.oilcsuite.admin.service.TrainerServices;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

	@Autowired
	private TrainerServices services;

	@PostMapping("/saveTrainer")
	public ResponseEntity<TrainerEntity> saveTrainer(@Valid @RequestBody TrainerEntity trainerEntity) {
		TrainerEntity saveTrainer = services.saveTrainer(trainerEntity);
		return new ResponseEntity<TrainerEntity>(saveTrainer, HttpStatus.OK);

	}

	@GetMapping("/viewAllTrainers")
	public ResponseEntity<List<TrainerEntity>> viewAllTrainers() {
		List<TrainerEntity> viewAllTrainers = services.viewAllTrainers();
		return new ResponseEntity<List<TrainerEntity>>(viewAllTrainers, HttpStatus.OK);
	}

	@GetMapping("/viewTrainerById/{id}")
	public ResponseEntity<TrainerEntity> getTrainerById(@PathVariable("id") Integer id) {
		TrainerEntity trainerById = services.getTrainerById(id);
		return new ResponseEntity<TrainerEntity>(trainerById, HttpStatus.OK);
	}

	@DeleteMapping("/deleteTrainerById/{id}")
	public ResponseEntity<String> deleteTrainerById(@PathVariable("id") Integer id) {
		boolean deleteTrainerById = services.deleteTrainerById(id);
		String msg = "";
		if (deleteTrainerById) {
			msg = "Trainer deleted Successfully..!";
		} else {
			msg = "Trainer not deleted..!";
		}
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}
	
	@PostMapping("/updateTrainer")
	public ResponseEntity<TrainerEntity> updateTrainer(@Valid @RequestBody TrainerEntity trainerEntity) {
		TrainerEntity saveTrainer = services.saveTrainer(trainerEntity);
		return new ResponseEntity<TrainerEntity>(saveTrainer, HttpStatus.OK);

	}
	
	@PostMapping("/login")
	public ResponseEntity<String> trainerLogin(@Valid @RequestBody LoginHelper helper){
		boolean trainerValid = services.isTrainerValid(helper);
		String msg = "";
		if(trainerValid) {
			msg = "success";
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		}else {
			msg = "UnAuthorized";
			return new ResponseEntity<String>(msg, HttpStatus.UNAUTHORIZED);
		}
		
	}
	
}
