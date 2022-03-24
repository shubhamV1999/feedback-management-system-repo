package com.sapient.aem.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Trainer {

	private Integer trainerId;
	private String  trainerName;
	private String qualification;
	private String[]  skills;
	private Integer experience;
	private Long mobile;
	private String  email;
	
	
	
	public Trainer(String trainerName, String qualification, String[] skills, Integer experience, Long mobile,
			String email) {
		super();
		this.trainerName = trainerName;
		this.qualification = qualification;
		this.skills = skills;
		this.experience = experience;
		this.mobile = mobile;
		this.email = email;
	}
	
	
	
	
	
	
	
		

}