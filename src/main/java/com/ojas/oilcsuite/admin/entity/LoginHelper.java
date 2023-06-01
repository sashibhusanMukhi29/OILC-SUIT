package com.ojas.oilcsuite.admin.entity;



import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LoginHelper {

	@NotNull(message = "Username must not be null")
	private String username;
	@NotNull(message = "Password must not be null")
	private String password;
}
