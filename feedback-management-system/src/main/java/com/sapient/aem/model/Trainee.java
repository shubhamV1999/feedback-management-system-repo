package com.sapient.aem.model;

import java.time.LocalDate;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Trainee {
	
	private Integer traineeId;
	private String traineeName;
	private String gender;	
	private LocalDate birthdate;
	private String qualification;
	private String address;
	private Long mobile;
	private String email;
	
	
	
	
	public Trainee(String traineeName, String gender, LocalDate birthdate, String qualification, String address,
			Long mobile, String email) {
		super();
		this.traineeName = traineeName;
		this.gender = gender;
		this.birthdate = birthdate;
		this.qualification = qualification;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
	}
	
	
	
	
	
}