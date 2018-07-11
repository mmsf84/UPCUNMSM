package com.upg.upc.unmsm.tutor.api.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upg.upc.unmsm.comon.controller.BaseController;
import com.upg.upc.unmsm.tutor.application.TutoriaApplication;
import com.upg.upc.unmsm.tutor.dto.ActivityDto;

@RestController
@RequestMapping("/tutorias/management/v1")
public class TutoriaController extends BaseController {
	private static final Logger log = LogManager.getLogger(TutoriaController.class);
	
	@Autowired
	private TutoriaApplication tutoriaApplication;
	
	
	@GetMapping(path = "/info")
	public String info() {
		return "Servicio Activo";
	}

	public ResponseEntity<Object> getActivityDto() {
		log.info("Into getActivityDto()");
		List<ActivityDto> activitiesDto= tutoriaApplication.getActivityDto();
		return this.getOkDataResponse(activitiesDto);

	}
}
