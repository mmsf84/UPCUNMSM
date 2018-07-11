package com.upg.upc.unmsm.tutor.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.upg.upc.unmsm.tutor.domain.repository.ActivityRepository;
import com.upg.upc.unmsm.tutor.dto.ActivityDto;

@Component
public class TutoriaApplication {
	
	@Autowired
	ActivityRepository activityRepository;

	public List<ActivityDto> getActivityDto() {
		return activityRepository.getActivitiesDto();
	}
}
