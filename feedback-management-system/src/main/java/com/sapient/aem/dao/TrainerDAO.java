package com.sapient.aem.dao;

import com.sapient.aem.model.Feedback;

public interface TrainerDAO {
	public void updateTrainerSkill(Integer trainerId);
	public Feedback displayReport(Feedback feedback);
}
