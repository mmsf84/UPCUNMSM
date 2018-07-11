package com.upg.upc.unmsm.tutor.domain.repository;

import java.util.List;

import com.upg.upc.unmsm.tutor.dto.ActivityDto;

public interface ActivityRepository {
	public List<ActivityDto> getActivitiesDto();
}
