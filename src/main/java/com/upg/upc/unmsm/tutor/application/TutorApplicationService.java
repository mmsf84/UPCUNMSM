package com.upg.upc.unmsm.tutor.application;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.upg.upc.unmsm.tutor.dto.AlumnoTallerAsisteDto;
import com.upg.upc.unmsm.tutor.dto.ConsultaAlumnoRegDto;
import com.upg.upc.unmsm.tutor.dto.TutorAsistenciaDto;
import com.upg.upc.unmsm.application.Notification;
import com.upg.upc.unmsm.application.dto.RequestBaseDto;
import com.upg.upc.unmsm.application.enumeration.RequestBodyType;


@Service
public class TutorApplicationService {

	@Transactional
	public void performAsistenciaTutor(TutorAsistenciaDto requestTutorAsistenciaDto) throws Exception {
		Notification notification = this.validation(requestTutorAsistenciaDto);
        if (notification.hasErrors()) {
            throw new IllegalArgumentException(notification.errorMessage());
        }
        
        AQUIIIII
        falta la logica de la funcionalidad.
	}
	
	@Transactional
	public void performAsistenciaAlumno(AlumnoTallerAsisteDto requestAlumnoAsistenciaDto) throws Exception {
		Notification notification = this.validation(requestAlumnoAsistenciaDto);
        if (notification.hasErrors()) {
            throw new IllegalArgumentException(notification.errorMessage());
        }
        
        AQUIIIII
        falta la logica de la funcionalidad.
	}
	
	@Transactional
	public void getAlumnoReg(ConsultaAlumnoRegDto selectAlumnoAsistenciaDto) throws Exception {
		Notification notification = this.validation(selectAlumnoAsistenciaDto);
        if (notification.hasErrors()) {
            throw new IllegalArgumentException(notification.errorMessage());
        }
        
        AQUIIIII
        falta la logica de la funcionalidad.
	}
	
	private Notification validation(RequestBaseDto requestDto) {
		Notification notification = new Notification();
		if (requestDto == null || requestDto.getRequestBodyType() == RequestBodyType.INVALID) {
			notification.addError("JSON invalido en el request.");
		}
		return notification;
	}
}
