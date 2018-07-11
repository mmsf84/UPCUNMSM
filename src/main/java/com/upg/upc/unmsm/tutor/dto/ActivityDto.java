package com.upg.upc.unmsm.tutor.dto;

public class ActivityDto {
	private long id;
	private String name;
	private double horas;

	
	public ActivityDto() {
	}

	
	public ActivityDto(long id, String name, double horas) {
		super();
		this.id = id;
		this.name = name;
		this.horas = horas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

}
