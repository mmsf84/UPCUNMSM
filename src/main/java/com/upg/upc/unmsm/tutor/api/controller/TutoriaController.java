package com.upg.upc.unmsm.tutor.api.controller;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping("/tutorias/management/v1")
public class TutoriaController {

	@GetMapping(path = "/info")
	public String info() {
		return "Servicio Activo";
	}
	
}
