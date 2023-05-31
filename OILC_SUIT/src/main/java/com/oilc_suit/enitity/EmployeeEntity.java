package com.oilc_suit.enitity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(uniqueConstraints={@UniqueConstraint(columnNames={"email"})})
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull(message="cannot be mull  ")
	private String fName;
	@NotNull(message="cannot be mull  ")
	private String lName;
	@NotNull(message="cannot be mull  ")
	private String fullName;
	@NotNull(message="cannot be mull  ")
	private long phone;
	@Column(unique = true)
	private String email;
	@NotNull(message="cannot be mull  ")
	private String password;
	@NotNull(message="cannot be mull  ")
	private String techology;
	@NotNull(message="cannot be mull  ")
	private String address;
	@NotNull(message="cannot be mull  ")
	private String guardian;
	private String profilePic;

}
