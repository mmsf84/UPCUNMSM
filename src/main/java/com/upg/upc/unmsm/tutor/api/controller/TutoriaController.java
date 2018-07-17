package com.upg.upc.unmsm.tutor.api.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.upg.upc.unmsm.comon.controller.BaseController;
import com.upg.upc.unmsm.comon.controller.ResponseHandler;
import com.upg.upc.unmsm.tutor.application.TutorApplicationService;
import com.upg.upc.unmsm.tutor.application.TutoriaApplication;
import com.upg.upc.unmsm.tutor.dto.ActivityDto;
import com.upg.upc.unmsm.tutor.dto.AlumnoTallerAsisteDto;
import com.upg.upc.unmsm.tutor.dto.ConsultaAlumnoRegDto;
import com.upg.upc.unmsm.tutor.dto.TutorAsistenciaDto;

@RestController
@RequestMapping("/tutorias/management/v1")
public class TutoriaController extends BaseController {
	private static final Logger log = LogManager.getLogger(TutoriaController.class);
	
	@Autowired
	private TutoriaApplication tutoriaApplication;
	
	@Autowired
	private TutorApplicationService tutorApplicationService;
	
	@Autowired
	ResponseHandler responseHandler;
	
	
	@GetMapping(path = "/info")
	public String info() {
		return "Servicio Activo";
	}
	
	public ResponseEntity<Object> getActivityDto() {
		log.info("Into getActivityDto()");
		List<ActivityDto> activitiesDto= tutoriaApplication.getActivityDto();
		return this.getOkDataResponse(activitiesDto);

	}	
	
	@RequestMapping(method = RequestMethod.POST, path = "asistenciaTutor", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
	public ResponseEntity<Object> peformAsistenciaTutor(@RequestBody TutorAsistenciaDto requestTutorAsistenciaDto) throws Exception {
		try {
			tutorApplicationService.performAsistenciaTutor(requestTutorAsistenciaDto);
			return this.responseHandler.getOkCommandResponse("Asistencia de Tutor marcada!");
		} catch(IllegalArgumentException ex) {
			return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
		} catch(Exception ex) {
			return this.responseHandler.getAppExceptionResponse();
		}
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "asistenciaAlumno", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
	public ResponseEntity<Object> peformAsistenciaAlumno(@RequestBody AlumnoTallerAsisteDto requestAlumnoAsistenciaDto) throws Exception {
		try {
			tutorApplicationService.performAsistenciaAlumno(requestAlumnoAsistenciaDto);
			return this.responseHandler.getOkCommandResponse("Asistencia de Alumnos marcada!");
		} catch(IllegalArgumentException ex) {
			return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
		} catch(Exception ex) {
			return this.responseHandler.getAppExceptionResponse();
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "consultaAlumnoReg", consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
	public ResponseEntity<Object> selectAlumnoReg(@RequestBody ConsultaAlumnoRegDto requestConsultaAlumnoDto) throws Exception {
		try {
			return tutorApplicationService.getAlumnoReg(requestConsultaAlumnoDto);			
		} catch(IllegalArgumentException ex) {
			return this.responseHandler.getAppCustomErrorResponse(ex.getMessage());
		} catch(Exception ex) {
			return this.responseHandler.getAppExceptionResponse();
		}
	}
}
