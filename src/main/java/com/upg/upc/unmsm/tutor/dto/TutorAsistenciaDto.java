package com.upg.upc.unmsm.tutor.dto;

import com.upg.upc.unmsm.application.dto.RequestBaseDto;
import com.upg.upc.unmsm.comon.dto.CursoDto;
import com.upg.upc.unmsm.comon.dto.TutorDto;

public class TutorAsistenciaDto extends RequestBaseDto{

	private TutorDto tutor;
	private CursoDto curso;
	private String asistenciaFecha;
	private int tipoActividad;
	private String horaInicio;
	private String horaFin;
	private String aula;
	
	public TutorDto getTutor() {
		return tutor;
	}
	public void setTutor(TutorDto tutor) {
		this.tutor = tutor;
	}
	public CursoDto getCurso() {
		return curso;
	}
	public void setCurso(CursoDto curso) {
		this.curso = curso;
	}
	public String getAsistenciaFecha() {
		return asistenciaFecha;
	}
	public void setAsistenciaFecha(String asistenciaFecha) {
		this.asistenciaFecha = asistenciaFecha;
	}
	public int getTipoActividad() {
		return tipoActividad;
	}
	public void setTipoActividad(int tipoActividad) {
		this.tipoActividad = tipoActividad;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	public String getAula() {
		return aula;
	}
	public void setAula(String aula) {
		aula = aula;
	}
	
	
}
