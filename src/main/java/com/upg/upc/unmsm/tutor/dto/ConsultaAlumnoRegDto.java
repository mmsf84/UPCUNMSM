package com.upg.upc.unmsm.tutor.dto;

import com.upg.upc.unmsm.application.dto.RequestBaseDto;
import com.upg.upc.unmsm.comon.dto.CursoDto;

public class ConsultaAlumnoRegDto extends RequestBaseDto {

	private int sedeId;
	private int mes;
	private String semestre;
	private CursoDto curso;
	
	public int getSedeId() {
		return sedeId;
	}
	public void setSedeId(int sedeId) {
		this.sedeId = sedeId;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public CursoDto getCurso() {
		return curso;
	}
	public void setCurso(CursoDto curso) {
		this.curso = curso;
	}	
	
	
}
