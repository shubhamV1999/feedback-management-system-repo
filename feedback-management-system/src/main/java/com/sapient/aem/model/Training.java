package com.sapient.aem.model;
import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Training {
	

	private Integer trainingId;
	private String  programName;
	private LocalDate trainingStartdate;	
	private LocalDate trainingEnddate;
	private Integer trainerId;
	
	
	
	public Training(String programName, LocalDate trainingStartdate, LocalDate trainingEnddate, Integer trainerId) {
		super();
		this.programName = programName;
		this.trainingStartdate = trainingStartdate;
		this.trainingEnddate = trainingEnddate;
		this.trainerId = trainerId;
	}	
	
	
	
	
	
}