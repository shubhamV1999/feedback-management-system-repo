package com.sapient.aem.model;
import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Feedback 
{
	private Integer feedbackId;
	private Integer traineeId;
	private Integer trainerId ;
	private Integer trainingId;
	private Integer ratePace;
	private Integer rateknowledge;
	private Integer rateQueryHandling;
	private Integer rateNotes;
	private Integer rateMaterial;
	private Integer  rateOverallTraining;
	
	
	
	public Feedback(Integer traineeId, Integer trainerId, Integer trainingId, Integer ratePace, Integer rateknowledge,
			Integer ratequeryhandling, Integer rateNotes, Integer rateMaterial, Integer rateOverallTraining) {
		super();
		this.traineeId = traineeId;
		this.trainerId = trainerId;
		this.trainingId = trainingId;
		this.ratePace = ratePace;
		this.rateknowledge = rateknowledge;
		this.rateQueryHandling = ratequeryhandling;
		this.rateNotes = rateNotes;
		this.rateMaterial = rateMaterial;
		this.rateOverallTraining = rateOverallTraining;
	}
	
	

		
	     
	
}