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
public class Enrollment {
	
	private Integer enrollmentId;
	private Integer traineeId;
	private Integer trainingId;	
	private LocalDate enrollmentDate;
	
	
	
	public Enrollment( Integer traineeId, Integer trainingId, LocalDate enrollmentDate) {
		super();
		this.traineeId = traineeId;
		this.trainingId = trainingId;
		this.enrollmentDate = enrollmentDate;
	}
	
	
	

}