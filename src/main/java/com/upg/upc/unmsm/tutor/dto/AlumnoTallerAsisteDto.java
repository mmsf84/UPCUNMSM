package com.upg.upc.unmsm.tutor.dto;

import java.util.List;

import com.upg.upc.unmsm.application.dto.RequestBaseDto;
import com.upg.upc.unmsm.comon.dto.AlumnoDto;
import com.upg.upc.unmsm.comon.dto.CursoDto;
import com.upg.upc.unmsm.comon.dto.ProfesorDto;
import com.upg.upc.unmsm.comon.dto.TutorDto;


public class AlumnoTallerAsisteDto extends RequestBaseDto{

	private CursoDto curso;	
	private String actividadFecha;
	private String horaInicio;
	private TutorDto tutor;
	private List<AlumnoDto> alumnos;
	private ProfesorDto profesor;
	private String seccion;
	
	public CursoDto getCurso() {
		return curso;
	}
	public void setCurso(CursoDto curso) {
		this.curso = curso;
	}
	public String getActividadFecha() {
		return actividadFecha;
	}
	public void setActividadFecha(String actividadFecha) {
		this.actividadFecha = actividadFecha;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public TutorDto getTutor() {
		return tutor;
	}
	public void setTutor(TutorDto tutor) {
		this.tutor = tutor;
	}
	public List<AlumnoDto> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(List<AlumnoDto> alumnos) {
		this.alumnos = alumnos;
	}
	public ProfesorDto getProfesor() {
		return profesor;
	}
	public void setProfesor(ProfesorDto profesor) {
		this.profesor = profesor;
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	
}
