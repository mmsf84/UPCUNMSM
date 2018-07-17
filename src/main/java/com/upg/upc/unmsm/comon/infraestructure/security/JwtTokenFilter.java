package com.upg.upc.unmsm.comon.infraestructure.security;

import org.springframework.web.filter.GenericFilterBean;

 
public class JwtTokenFilter extends GenericFilterBean{
	
	private JwtTokenProvider jwtTokenProvider;

	public JwtTokenFilter(JwtTokenProvider jwtTokenProvider) {
		this.jwtTokenProvider = jwtTokenProvider;
	}
}
