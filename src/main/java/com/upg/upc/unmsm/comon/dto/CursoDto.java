package com.upg.upc.unmsm.comon.dto;

public class CursoDto {

	private long cursoId;
	private String cursoNombre;
	private boolean isHabilitado;
	
	public long getCursoId() {
		return cursoId;
	}
	public void setCursoId(long cursoId) {
		this.cursoId = cursoId;
	}
	public String getCursoNombre() {
		return cursoNombre;
	}
	public void setCursoNombre(String cursoNombre) {
		this.cursoNombre = cursoNombre;
	}
	public boolean isHabilitado() {
		return isHabilitado;
	}
	public void setHabilitado(boolean isHabilitado) {
		this.isHabilitado = isHabilitado;
	}
	
	
}
