package com.sapient.aem.dao;

import com.sapient.aem.model.Feedback;

public interface TraineeDAO {
	public abstract Feedback getFeedback(Integer traineeId,String traineeName);
}
