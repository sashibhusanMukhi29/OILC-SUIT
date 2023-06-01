package com.ojas.oilcsuite.admin.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "TRAINER")
public class TrainerEntity {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull(message = "Trainer Id must not be null")
	private Integer trainer_id;
	@NotNull(message = "FirstName must not be null")
	private String first_name;
	@NotNull(message = "LastName must not be null")
	private String last_name;
	
	private String middle_name;
	@NotNull(message = "Experience must not be null")
	private Integer experience;
	@NotNull(message = "Technology must not be null")
	private String technology;
	@NotNull(message = " UserName must not be null")
	private String username;
	@NotNull(message = "Password must must not be null")
	private String password;
	
}
